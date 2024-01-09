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