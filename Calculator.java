/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author ASUS
 */
import java.text.DecimalFormat;
public class Calculator extends javax.swing.JFrame {
    double numriPare;
    double numriDyte;
    String operatori="";
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        pamjaRezultatit.setEditable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        presja = new javax.swing.JButton();
        pjestim = new javax.swing.JButton();
        shumezim = new javax.swing.JButton();
        mbledhje = new javax.swing.JButton();
        zbritje = new javax.swing.JButton();
        barazim = new javax.swing.JButton();
        pamjaRezultatit = new javax.swing.JTextField();
        fshijEkranin = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        negacion = new javax.swing.JButton();
        fshijNumTeFundit = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        presja.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        presja.setText(".");
        presja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presjaActionPerformed(evt);
            }
        });

        pjestim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pjestim.setText("÷");
        pjestim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjestimActionPerformed(evt);
            }
        });

        shumezim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        shumezim.setText("×");
        shumezim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shumezimActionPerformed(evt);
            }
        });

        mbledhje.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbledhje.setText("+");
        mbledhje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbledhjeActionPerformed(evt);
            }
        });

        zbritje.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zbritje.setText("-");
        zbritje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zbritjeActionPerformed(evt);
            }
        });

        barazim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        barazim.setText("=");
        barazim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barazimActionPerformed(evt);
            }
        });

        pamjaRezultatit.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        pamjaRezultatit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pamjaRezultatit.setToolTipText("");
        pamjaRezultatit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pamjaRezultatitActionPerformed(evt);
            }
        });

        fshijEkranin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fshijEkranin.setText("C");
        fshijEkranin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fshijEkraninActionPerformed(evt);
            }
        });

        backspace.setText("⌫");
        backspace.setToolTipText("");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        negacion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        negacion.setText("+/-");
        negacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negacionActionPerformed(evt);
            }
        });

        fshijNumTeFundit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fshijNumTeFundit.setText("CE");
        fshijNumTeFundit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fshijNumTeFunditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pamjaRezultatit)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(negacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(presja, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(barazim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(zbritje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(mbledhje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(fshijEkranin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fshijNumTeFundit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(shumezim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pjestim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pamjaRezultatit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fshijEkranin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pjestim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fshijNumTeFundit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shumezim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mbledhje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zbritje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(presja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barazim, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(negacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    private boolean eshteNumer(String teksti){
        boolean rezultati=false;
        for(int i=0;i<teksti.length();i++){
            char numriTanishem=teksti.charAt(i);
            if(Character.isDigit(numriTanishem)){
                rezultati=true;
            }else if(numriTanishem==('.')){
                
            }else if(numriTanishem=='-' && i==0){
                
            }else{
                return false;
            }
        }
        return rezultati;
    }
    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"6");    
    }                                    

    private void mbledhjeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(pamjaRezultatit.getText().equals(".")){
        }else{
            if(operatori.isEmpty()){
                if(pamjaRezultatit.getText().length()>0){
                    numriPare=Double.parseDouble(pamjaRezultatit.getText());
                    operatori="+";
                    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                }else{
                    operatori="+";
                    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                }
                
            }else {
                if(pamjaRezultatit.getText().lastIndexOf(operatori)==0){
                    if(pamjaRezultatit.getText().length()>1 ){
                        numriPare=Double.parseDouble(pamjaRezultatit.getText());
                        operatori="+";
                        pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                    }else{
                        operatori="+";
                        String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
                        pamjaRezultatit.setText(nderrimi+operatori);
                    }
                }else if(pamjaRezultatit.getText().endsWith(operatori)) {
                    operatori="+";
                    String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
                    pamjaRezultatit.setText(nderrimi+operatori);
                }else{
                    
                }
            }
        }
    }                                        

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"7");    
    }                                    

    private void pamjaRezultatitActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        
    }                                               

    private void fshijEkraninActionPerformed(java.awt.event.ActionEvent evt) {                                             
        pamjaRezultatit.setText("");
        operatori="";
    }                                            

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"8");    
    }                                    

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"9");    
    }                                    

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"4");    
    }                                    

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"5");    
    }                                    

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"1");    
    }                                    

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"2");    
    }                                    

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"3");    
    }                                    

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        pamjaRezultatit.setText(pamjaRezultatit.getText()+"0");    
    }                                    

    private void presjaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(pamjaRezultatit.getText().contains(".")){
            if(pamjaRezultatit.getText().lastIndexOf(operatori)==(pamjaRezultatit.getText().length()-1)){
                
            } else{
                if(pamjaRezultatit.getText().indexOf(operatori)>pamjaRezultatit.getText().lastIndexOf("."))
                {
                    pamjaRezultatit.setText(pamjaRezultatit.getText()+".");
                }
            }
        }else{
            if(pamjaRezultatit.getText().lastIndexOf(operatori)==(pamjaRezultatit.getText().length()-1)){
                
            }else{
                pamjaRezultatit.setText(pamjaRezultatit.getText()+".");
            }
        }
    }                                      

    private void zbritjeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(pamjaRezultatit.getText().equals(".")){
        }else{ if(operatori.isEmpty()){
            if(pamjaRezultatit.getText().length()>0){
                numriPare=Double.parseDouble(pamjaRezultatit.getText());
                operatori="-";
                pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
            }else{
                operatori="-";
                pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
            }
            
        }else {
            if(pamjaRezultatit.getText().lastIndexOf(operatori)==0){
                if(pamjaRezultatit.getText().length()>1 ){
                    numriPare=Double.parseDouble(pamjaRezultatit.getText());
                    operatori="-";
                    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                }else{
                    operatori="-";
                    String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
                    pamjaRezultatit.setText(nderrimi+operatori);
                }
            }else if(pamjaRezultatit.getText().endsWith(operatori)) {
                operatori="-";
                String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
                pamjaRezultatit.setText(nderrimi+operatori);
            }else{
                
            }
        }
        }
    }                                       

    private void shumezimActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(pamjaRezultatit.getText().equals(".")){
        }else{
            if(operatori.isEmpty()){
                if(pamjaRezultatit.getText().length()>0){
                    if(pamjaRezultatit.getText().equals(".")){
                        
                    }else{
                        numriPare=Double.parseDouble(pamjaRezultatit.getText());
                        operatori="×";
                        pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                    }
                }
            }else {
                if(pamjaRezultatit.getText().startsWith(operatori)){
                    if(pamjaRezultatit.getText().length()>1 && pamjaRezultatit.getText().lastIndexOf(operatori)==0){
                        numriPare=Double.parseDouble(pamjaRezultatit.getText());
                        operatori="×";
                        pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                    }
                }else if(pamjaRezultatit.getText().endsWith(operatori)) {
                    operatori="×";
                    String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
                    pamjaRezultatit.setText(nderrimi+operatori);
                }else{
                    
                }
            }
        }
    }                                        

    private void pjestimActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(pamjaRezultatit.getText().equals(".")){
        }else{
            if(operatori.isEmpty()){
                if(pamjaRezultatit.getText().length()>0){
                    numriPare=Double.parseDouble(pamjaRezultatit.getText());
                    operatori="÷";
                    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                }
            }else {
                if(pamjaRezultatit.getText().startsWith(operatori)){
                    if(pamjaRezultatit.getText().length()>1 && pamjaRezultatit.getText().lastIndexOf(operatori)==0){
                        numriPare=Double.parseDouble(pamjaRezultatit.getText());
                        operatori="÷";
                        pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
                    }
                }else if(pamjaRezultatit.getText().endsWith(operatori)) {
                    operatori="÷";
                    String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
                    pamjaRezultatit.setText(nderrimi+operatori);
                }else{
                    
                }
            }
        }
    }                                       

    private void barazimActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(pamjaRezultatit.getText().equals(".")){
            
        }else{
            if(operatori.isEmpty() || pamjaRezultatit.getText().lastIndexOf(operatori)==(pamjaRezultatit.getText().length())-1){
                
            }else{
                int indeksi=pamjaRezultatit.getText().lastIndexOf(operatori)+1;
                String numriDyteString=pamjaRezultatit.getText().substring(indeksi,pamjaRezultatit.getText().length());
                numriDyte=Double.parseDouble(numriDyteString);
                if(operatori.equals("+")){
                    pamjaRezultatit.setText(String.valueOf(numriPare+numriDyte));
                }else if(operatori.equals("-")){
                    pamjaRezultatit.setText(String.valueOf(numriPare-numriDyte));
                } else if (operatori.equals("÷")){
                    if (numriDyte==0){
                        pamjaRezultatit.setText("I pa definuar");
                    }else{
                        pamjaRezultatit.setText(String.valueOf(numriPare/numriDyte));
                    }
                }else {
                    pamjaRezultatit.setText(String.valueOf(numriPare*numriDyte));
                }
                operatori="";
            }
        }               
    }                                       

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(pamjaRezultatit.getText().isEmpty()){
        }else if(pamjaRezultatit.getText().equals("I pa definuar")){
            pamjaRezultatit.setText("");
        }else if(pamjaRezultatit.getText().endsWith(operatori)){
            pamjaRezultatit.setText(pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1));
            operatori="";
        }else{
            pamjaRezultatit.setText(pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1));
        }
    }                                         

    private void fshijNumTeFunditActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if(operatori.isEmpty()){
            pamjaRezultatit.setText("");
            operatori="";
        }else{
            if(pamjaRezultatit.getText().lastIndexOf(operatori)==0){
                pamjaRezultatit.setText("");
                operatori="";
            }else{
                String fshirjaENum2= pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().lastIndexOf(operatori)+1);
                pamjaRezultatit.setText(fshirjaENum2);
            }
        }
    }                                                

    private void negacionActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(operatori.isEmpty()){
            if(eshteNumer(pamjaRezultatit.getText())){
                double numri=Double.parseDouble(pamjaRezultatit.getText());
                if(numri>0){
                    operatori="-";
                    pamjaRezultatit.setText(operatori+numri);
                }else{
                    String nderrimi=pamjaRezultatit.getText().substring(1,pamjaRezultatit.getText().length());
                    operatori="+";
                    pamjaRezultatit.setText(operatori+nderrimi);
                }
                numriPare=0;
            }
        }else{
            if(pamjaRezultatit.getText().lastIndexOf(operatori)==0){
                if(operatori.equals("+")){
                    operatori="-";
                    String ndryshimiOperatorit=pamjaRezultatit.getText().replace("+","-");
                    pamjaRezultatit.setText(ndryshimiOperatorit);
                }else if(operatori.equals("-")){
                    operatori="+";
                    String ndryshimiOperatorit=pamjaRezultatit.getText().replace("-","+");
                    pamjaRezultatit.setText(ndryshimiOperatorit);
                }
            }else if(pamjaRezultatit.getText().lastIndexOf(operatori)>0){
                int indeksiOperatorit =pamjaRezultatit.getText().lastIndexOf(operatori);
                String pjesaPareERez=pamjaRezultatit.getText().substring(0,indeksiOperatorit);
                String pjesaDyteERez=pamjaRezultatit.getText().substring(indeksiOperatorit,pamjaRezultatit.getText().length());
                if(operatori.equals("+")){
                    operatori="-";
                    pjesaDyteERez=pjesaDyteERez.replace("+","-");
                    pamjaRezultatit.setText(pjesaPareERez+pjesaDyteERez);
                }else if(operatori.equals("-")){
                    operatori="+";
                    pjesaDyteERez=pjesaDyteERez.replace("-","+");
                    pamjaRezultatit.setText(pjesaPareERez+pjesaDyteERez);
                }
            }
        }
    }                                        
    
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backspace;
    private javax.swing.JButton barazim;
    private javax.swing.JButton fshijEkranin;
    private javax.swing.JButton fshijNumTeFundit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton mbledhje;
    private javax.swing.JButton negacion;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextField pamjaRezultatit;
    private javax.swing.JButton pjestim;
    private javax.swing.JButton presja;
    private javax.swing.JButton shumezim;
    private javax.swing.JButton zbritje;
    // End of variables declaration                   
}
