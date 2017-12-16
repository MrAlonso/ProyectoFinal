/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alons
 */
public class Nodo {
   
    public int iValor;
    public String sNombre;
    public int ID;
    public int iCantidad;
    public int iPrecio;
    public String sTipo;
    public String sFecha;
    private Nodo nSig;
    public Nodo(){
        iValor=0;
        nSig=null;
    }

        public Nodo(String sNombre,int ID, int iCantidad, int iPrecio, String sTipo, String sFecha) {
            this.sNombre=sNombre;
            this.ID = ID;
            this.iCantidad = iCantidad;
            this.iPrecio = iPrecio;
            this.sTipo=sTipo;
            this.sFecha=sFecha;
        }
    

        public Nodo(String sNombre) {
            this.sNombre = sNombre;
        }

        public String getsNombre() {
            return sNombre;
        }

        public void setsNombre(String sNombre) {
            this.sNombre = sNombre;
        }
        public String getsFecha(){
            return sFecha;
        }
        public void setsFecha(String sFecha){
            this.sFecha=sFecha;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getiCantidad() {
            return iCantidad;
        }

        public void setiCantidad(int iCantidad) {
            this.iCantidad = iCantidad;
        }

        public int getiPrecio() {
            return iPrecio;
        }

        public void setiPrecio(int iPrecio) {
            this.iPrecio = iPrecio;
        }
        
    
    public Nodo(int iVal){
        iValor=iVal;
        nSig=null;
    }
    public Nodo(int iVal, Nodo nNod){
        iValor=iVal;
        nSig=nNod;
    }
    

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
}



