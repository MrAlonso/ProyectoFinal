/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ed
 */

    public class Lista{
    private Nodo nIni;
    private Nodo nFin;
    public Lista(){
        nIni=null;
        nFin=null;
    }
    public Lista(Nodo nNodo){
        nIni=nNodo;
        nFin=nNodo;
    }
    //AGREGAR NODO LOS COLOCA AL FINAL DE LA LISTA  
    public void agregarNodo(Nodo nNodo){ //NO VOLVER A USAR JAMAS!!!!!
        Nodo nTemp=nIni;
        if(nIni==null){
            nIni=nNodo;
        }else{
            while(nTemp.getnSig()!=null){
                nTemp=nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
    }
    public void agregarNodoMejorado(Nodo nNodo){
        if(nIni==null){
            nIni=nNodo;
            nFin=nNodo;
        }else{
            nFin.setnSig(nNodo);
            nFin=nNodo;
        }
    }
    //IMPRIMIR NODOS
    public void imprimirNodos(){
        Nodo nTemp=nIni;
        if(nIni==null){
            System.out.println("LISTA VACIA");
        }else{
            while(nTemp.getnSig()!=null){
                System.out.print(nTemp.getiValor()+" - ");
                nTemp=nTemp.getnSig();
            }
            
        }
        
    }
    //VACIAR LA LISTA
    public void vaciarLista(){
        nIni=null;
        nFin=null;
    }
    //CONTAR LOS ELEMENTOS DE LA LISTA
    public int contarElementos(){
        Nodo nTemp=nIni;
        if(nIni==null){
            return 0;
        }else{
            int iCon=0;
            while(nTemp.getnSig()!=null){
                iCon++;
                nTemp=nTemp.getnSig();
            }
            return iCon;
        }
    }
    public int valorEn(int iPos) throws Exception{
        //VERIFICAR QUE LA POSICION SEA MENOR AL TAMAÑO DEL ARREGLO
        int iVal=0;
        if(iPos<contarElementos()&& (iPos>=0)){
            Nodo nTemp=nIni;
            for (int i = 0; i <iPos ; i++) {
                nTemp.getnSig();
            }
            iVal=nTemp.getiValor();
        }else{
            throw new Exception("La posición no es válida");
        }
        return iVal;
    }

    public void insertarEn(int iPos, Nodo nNodo){
        //VERIGICAR IPOS >=0, IPOS < TAMAÑO DE LA LISTA
        
        if (iPos==0) {// INSERTAR AL INICIO DE LA LISTA
            nNodo.setnSig(nIni);
            nIni = nNodo;
            
        }else{ //INSERTAR EN CUALQUIER POSICION DE LA LISTA ( EXCEPTO AL FINAL)
            Nodo nTemp = nIni;
            for (int i = 0; i < (iPos - 1); i++) {
                nTemp = nTemp.getnSig();
                
            }
            nNodo.setnSig (nTemp.getnSig());
            nTemp.setnSig(nNodo);
        }
    }
    
    public void borrarUnElemento(int iPos,Nodo nBo ){
        
        
    }
    public int buscarEn(int iBus){
        Nodo nTemp=nIni;
        int iCon=0;
        int iPos=0;
        while(iCon==0){
           if(nTemp.getID()==iBus){
               iCon=1;
                    return iPos;
           }else{
                nTemp=nTemp.getnSig();
                
           }
                iPos++;
                //return 0;


        }
        return 0;
    }
    public int binSearchRec(int iValorBuscar, int iLo, int iHi){
        Nodo nTemp=nIni;
        int iPos=-1;
        int iMid=iLo+((iHi-iLo)/2);
        for (int i = 0; i < iMid; i++) {
            nTemp=nTemp.getnSig();
        }
        if(iValorBuscar==nTemp.getID()){
            iPos=iMid;
        }else if(iValorBuscar<nTemp.getID()){
            iPos=binSearchRec(iValorBuscar, iLo, iMid-1);
        }else if(iValorBuscar>nTemp.getID()){
            iPos=binSearchRec(iValorBuscar,iMid, iHi);
        }
        return iPos;
    }
    
    public int IDUltimo(){
        Nodo nTemp=nIni;
        int iCon=0;
        int ID=0;
        while(nTemp.getnSig()!=null){
           nTemp=nTemp.getnSig();
           
                //return 0;


        }
        ID=nTemp.getID();
        return ID;
    }
    public int buscarConNombre(String name){
        Nodo nTemp=nIni;
        int iCon=0;
        int iPos=0;
        while(nTemp.getnSig()!=null){
           if(nTemp.getsNombre().equals(name)){
               iCon=1;
                    return iPos;
           }else{
                nTemp=nTemp.getnSig();
                
           }
                iPos++;
                //return 0;


        }
        return 0;
    }
    public int nombreRepetido(String name){
        Nodo nTemp=nIni;
        int iCon=0;
        int iPos=0;
        while(iCon==0){
           if(nTemp.getsNombre().equals(name)){
               iCon=1;
                    
           }else{
                nTemp=nTemp.getnSig();
                
           }
                iPos++;
                //return 0;


        }
        return iCon;
    }
    public String buscarNombre(int iPos){
        Nodo nTemp=nIni;
        String nombre="";
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                nombre=nTemp.getsNombre();
            }else{
            nTemp=nTemp.getnSig();
            }
        }
        return nombre;
    }
    
    public String buscarFecha(int iPos){
        Nodo nTemp=nIni;
        String fecha="";
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                fecha=nTemp.getsFecha();
            }else{
            nTemp=nTemp.getnSig();
            }
        }
        return fecha;
    }
    public int buscarCantidad(int iPos){
        Nodo nTemp=nIni;
        int cant=0;
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                cant=nTemp.getiCantidad();
            }else{
                 nTemp=nTemp.getnSig();
            }
        }
        return cant;
    }
    public int buscarPrecio(int iPos){
        Nodo nTemp=nIni;
        int prec=0;
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                prec=nTemp.getiPrecio();
            }else{
                nTemp=nTemp.getnSig();
            }
        }
        return prec;
    }
    public int buscarID(int iPos){
        Nodo nTemp=nIni;
        int id=0;
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                id=nTemp.getID();
            }else{
                nTemp=nTemp.getnSig();
            }
        }
        return id;
    }
    public void cambiarNombre(String name, int iPos){
        Nodo nTemp=nIni;
        
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                nTemp.setsNombre(name);
            }else{
            nTemp=nTemp.getnSig();
            }
        }
        
    }
    public void cambiarCantidad(int cant, int iPos){
        Nodo nTemp=nIni;
        
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                nTemp.setiCantidad(cant);
            }else{
            nTemp=nTemp.getnSig();
            }
        }
        
    }
    public void cambiarPrecio(int precio, int iPos){
        Nodo nTemp=nIni;
        
        for (int i = 0; i <= iPos; i++) {
            
            if(i==iPos){
                nTemp.setiPrecio(precio);
            }else{
            nTemp=nTemp.getnSig();
            }
        }
    }
    public int contarElementos1(){
        Nodo nTemp=nIni;
        if(nIni==null){
            return 0;
        }else{
            int iCon=1;
            while(nTemp.getnSig()!=null){
                iCon++;
                nTemp=nTemp.getnSig();
            }
            return iCon;
        }
    }
    public void borrarEn(int iPos){
        if(iPos==0){
            nIni=nIni.getnSig();
        }else{
            Nodo nTemp=nIni;
            for (int i = 0; i < (iPos-1); i++) {
                nTemp=nTemp.getnSig();
            }
            nTemp.setnSig(nTemp.getnSig().getnSig());
            
        }
    }
    
    
}


