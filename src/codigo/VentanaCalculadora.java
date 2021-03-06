/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Thomas
 */
public class VentanaCalculadora extends javax.swing.JFrame {
    
    //Aquí declaramos las variables de instancia.
    //Declaramos dos strings, uno para el número y otro para el operador.
    
    String numero1;
    String operacion;
    boolean pressed;
    boolean dibuja;
    boolean igual;

    /**
     * Creates new form VentanaCalculadora
     * Este es el constructor de la clase porque tiene el mismo nombre que
     * la clase, es público y no devuelve nada.
     */
    public VentanaCalculadora() {
        initComponents();  
    }
    //Este método escribe los´números en el label de la calculadora. Primero comprueba que no
    //Haya un cero, en cuyo caso cambia el cero por el número que hayamos seleccionado.
    //En caso de haber ya un número lo que hace es escribir el siguiente en el string. Por
    //eso cadena1(el texto ya escrito) más el nímero que escribamos.
    private void pintaNumero(String numero){
     if(dibuja==false){
        String cadena1 = jLabel1.getText();
        if(cadena1.equals("0")){ //Estoy en el caso inicial de la calculadora con un 0 en el display
          jLabel1.setText(numero);
        }else{
        jLabel1.setText(cadena1 + numero);}
     }
    }
    //Con este método vamos a realizar las operaciones de nuestra calculadora.
    private void realizaOperacion(){
        //setText lee en el label. getText obtiene el label.
        if(pressed==false){
        numero1 = jLabel1.getText();
        //Limpiamos la pantalla para poder escribir el segundo operando.
        jLabel1.setText("0");
        pressed=true;
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        BotonMultiplica = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonDivide = new javax.swing.JButton();
        BotonDecimal = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonRaiz = new javax.swing.JButton();
        BotonPorciento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.setOpaque(true);

        Boton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton7.setText("7");
        Boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton7MousePressed(evt);
            }
        });

        Boton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton8.setText("8");
        Boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton8MousePressed(evt);
            }
        });

        Boton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton9.setText("9");
        Boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton9MousePressed(evt);
            }
        });

        Boton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton4.setText("4");
        Boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton4MousePressed(evt);
            }
        });

        Boton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton5.setText("5");
        Boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton5MousePressed(evt);
            }
        });

        Boton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton6.setText("6");
        Boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton6MousePressed(evt);
            }
        });

        Boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton1.setText("1");
        Boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton1MousePressed(evt);
            }
        });
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton2.setText("2");
        Boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton2MousePressed(evt);
            }
        });
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton3.setText("3");
        Boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton3MousePressed(evt);
            }
        });

        BotonSuma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonSuma.setText("+");
        BotonSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonSumaMousePressed(evt);
            }
        });

        BotonResta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonResta.setText("-");
        BotonResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonRestaMousePressed(evt);
            }
        });

        BotonMultiplica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonMultiplica.setText("*");
        BotonMultiplica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonMultiplicaMousePressed(evt);
            }
        });

        Boton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton0.setText("0");
        Boton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton0MousePressed(evt);
            }
        });

        BotonIgual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonIgual.setText("=");
        BotonIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonIgualMousePressed(evt);
            }
        });

        BotonDivide.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonDivide.setText("/");
        BotonDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonDivideMousePressed(evt);
            }
        });

        BotonDecimal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonDecimal.setText(".");
        BotonDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonDecimalMousePressed(evt);
            }
        });

        BotonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonBorrar.setText("AC");
        BotonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBorrarMousePressed(evt);
            }
        });

        BotonRaiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonRaiz.setText("R");
        BotonRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonRaizMousePressed(evt);
            }
        });

        BotonPorciento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonPorciento.setText("%");
        BotonPorciento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonPorcientoMousePressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("X2");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonIgual))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Boton7)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Boton8, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Boton9)
                                    .addComponent(Boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Boton3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonMultiplica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonSuma))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BotonRaiz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonPorciento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Boton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 2, Short.MAX_VALUE)
                            .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BotonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotonMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotonPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(BotonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BotonIgual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonDivide, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonDecimal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Boton0, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton7MousePressed
       pintaNumero("7");

    }//GEN-LAST:event_Boton7MousePressed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton8MousePressed
       pintaNumero("8");
    }//GEN-LAST:event_Boton8MousePressed

    private void Boton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton9MousePressed
        pintaNumero("9");
    }//GEN-LAST:event_Boton9MousePressed

    private void Boton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton4MousePressed
        pintaNumero("4");
    }//GEN-LAST:event_Boton4MousePressed

    private void Boton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton5MousePressed
        pintaNumero("5");
    }//GEN-LAST:event_Boton5MousePressed

    private void Boton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton6MousePressed
        pintaNumero("6");
    }//GEN-LAST:event_Boton6MousePressed

    private void Boton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MousePressed
        pintaNumero("1");
    }//GEN-LAST:event_Boton1MousePressed

    private void Boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MousePressed
        pintaNumero("2");
    }//GEN-LAST:event_Boton2MousePressed

    private void Boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton3MousePressed
        pintaNumero("3");
    }//GEN-LAST:event_Boton3MousePressed

    private void Boton0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton0MousePressed
        pintaNumero("0");
    }//GEN-LAST:event_Boton0MousePressed

    private void BotonSumaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSumaMousePressed

        operacion ="+";
        realizaOperacion();
    }//GEN-LAST:event_BotonSumaMousePressed

    private void BotonRestaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRestaMousePressed
        operacion ="-";
        realizaOperacion();
    }//GEN-LAST:event_BotonRestaMousePressed

    private void BotonMultiplicaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMultiplicaMousePressed
        operacion ="*";
        realizaOperacion();
    }//GEN-LAST:event_BotonMultiplicaMousePressed

    private void BotonDivideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDivideMousePressed
        operacion ="/";
        realizaOperacion();
    }//GEN-LAST:event_BotonDivideMousePressed
//Con este método vamos a obtener los resultados de las diversas operaciones que hagamos.
    private void BotonIgualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIgualMousePressed
       //Va a leer lo que hay en el jLabel1.
        String numero2 = jLabel1.getText();
        //Hay que transformar los strings en números (usamos double para que lea decimales).
        //valueOf coge el string y calcula su valor en números.
        double operando2 = Double.valueOf(numero2);
        double operando1 = Double.valueOf(numero1);
        if(operacion.equals("+") && igual==false){
            operando1+=operando2;  //Sumamos operando 1 a operando 2 y guardamos el valor en                                    //el operando 1.
        }                          //el operando1.
        //Calcula la resta entre dos números.
        if(operacion.equals("-") && igual==false){
            operando1-=operando2;  
        }
        //Calcula la multiplicación entre dos números.
        if(operacion.equals("*") && igual==false){
            operando1*=operando2;
        }
        //Calcula la división entre dos números.
        if(operacion.equals("/") && igual==false){
            operando1/=operando2;
        }
        //Calcula la raíz cuadrada de un número.
        if(operacion.equals("R") && igual==false){
            operando1=Math.sqrt(operando1);
        }
        //Calcula el porcentaje de un número.
        if(operacion.equals("%") && igual==false){
            operando1=(operando1*operando2)/100;
        }
        //Calcula el cuadrado de un número.
        if(operacion.equals("x2") && igual==false){
            operando1=operando1*operando1;
        }
        //Esta operación resetea el valor de la variable a 0 mediante una multiplicación.
       if(operacion.equals("AC")){
            operando1=operando1*0;
        }
        //Imprime en el label el valor del operando1.
        if(igual==false){
           jLabel1.setText(String.valueOf(operando1));
        }     
        dibuja=true;
        igual=true;
    }//GEN-LAST:event_BotonIgualMousePressed
//Este método nos define el botón decimal. Creamos on boolean que predeterminamos a false.
    //Comprobamos si el string ontiene ya un punto decimal y si lo contiene cambiamos el
    //booleano a true y ya no nos permite escribir más decimales. En caso de no haber un decimal
    //pintamos un decimal.
    private void BotonDecimalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDecimalMousePressed
        boolean contiene=false;
        String cadena = jLabel1.getText();
        if(cadena.contains(".")){
            contiene=true;
        }else{
        pintaNumero(".");  
        }
    }//GEN-LAST:event_BotonDecimalMousePressed

    private void BotonBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarMousePressed
        operacion ="AC";
        numero1 = jLabel1.getText();     
        jLabel1.setText("0");
        pressed=false;
        dibuja=false;
        igual=false;
    }//GEN-LAST:event_BotonBorrarMousePressed

    private void BotonRaizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRaizMousePressed
        operacion ="R";
        realizaOperacion();
    }//GEN-LAST:event_BotonRaizMousePressed

    private void BotonPorcientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPorcientoMousePressed
        operacion ="%";
        realizaOperacion();
    }//GEN-LAST:event_BotonPorcientoMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        operacion ="x2";
        realizaOperacion();
    }//GEN-LAST:event_jButton1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonDecimal;
    private javax.swing.JButton BotonDivide;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMultiplica;
    private javax.swing.JButton BotonPorciento;
    private javax.swing.JButton BotonRaiz;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
