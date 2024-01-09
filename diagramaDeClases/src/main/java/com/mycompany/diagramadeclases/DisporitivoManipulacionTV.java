/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diagramadeclases;

/**
 * 
Debe aplicarse factory method (creo yo xdd)
* 
 */
abstract class DisporitivoManipulacionTV {
    private String botones;
    private String control;
    private String viaWifi;
    private String entradas;

    public DisporitivoManipulacionTV() {
    }
    public DisporitivoManipulacionTV(String botones, String control, String viaWifi, String entradas){
        this.botones = botones;
        this.control = control;
        this.viaWifi = viaWifi;
        this.entradas = entradas;
        
        
    }

    public void setEntradas(String entradas) {
        this.entradas = entradas;
    }

    public String getEntradas() {
        return entradas;
    }
    public String getBotones() {
        return botones;
    }

    public void setBotones(String botones) {
        this.botones = botones;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getViaWifi() {
        return viaWifi;
    }

    public void setViaWifi(String viaWifi) {
        this.viaWifi = viaWifi;
    }

    @Override
    public String toString() {
        return "DisporitivoManipulacionTV{" + "botones=" + botones + ", control=" + control + ", viaWifi=" + viaWifi + ", entradas=" + entradas + '}';
    }
    
    public class PanelTv extends DisporitivoManipulacionTV{

        public PanelTv() {
        }
        
        public PanelTv(String botones, String control, String viaWifi, String entradas){
super (botones, control, viaWifi, entradas);
        
        
    }

        @Override
        public String toString() {
            return "PanelTv{" + '}';
        }

    }
    
    public class ControlInfrarojo extends DisporitivoManipulacionTV{

        public ControlInfrarojo() {
        }
                public ControlInfrarojo(String botones, String control, String viaWifi, String entradas){
super (botones, control, viaWifi, entradas);
        
        
    }

        @Override
        public String toString() {
            return "ControlInfrarojo{" + '}';
        }

        
    }
    
    interface Dispositivo{
        void encender();
        void apagar();
        void manipularVolumen();
        void cambiarEntrada();
        
    }
    class controlInfrarrojo implements Dispositivo  {
        @Override
        public void encender(){
             throw new UnsupportedOperationException("Not supported yet.");
        }
        @Override
        public void apagar(){
             throw new UnsupportedOperationException("Not supported yet.");
        }
        @Override
        public void manipularVolumen(){
             throw new UnsupportedOperationException("Not supported yet.");
        }
        @Override
        public void cambiarEntrada(){
             throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }

    class PanelTV implements Dispositivo{

        @Override
        public void encender() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void apagar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void manipularVolumen() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void cambiarEntrada() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    abstract class SmartPhone{
        abstract Dispositivo factoryMethod();
    }
    class SmartPhoneCrear extends SmartPhone{
        Dispositivo factoryMethod(){
            return new DispositivoImpl() {
                @Override
                public void encender() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void apagar() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
        }

        private abstract class DispositivoImpl implements Dispositivo {

            public DispositivoImpl() {
            }

            public void iniciarAplicacion() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void escanearDispositivos() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }

            public void seleccionarDDispositivos() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }

            public void iniciarDispositivos() {
                throw new UnsupportedOperationException("Not supported yet.");
            }      
            public void detenerDispositivo() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
            @Override
            public void manipularVolumen() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
            @Override
            public void cambiarEntrada() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }
    }
}


/*
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
*/