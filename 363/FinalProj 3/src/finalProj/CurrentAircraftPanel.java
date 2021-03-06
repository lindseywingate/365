/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProj;

/**
 *
 * @author Dakota Krout
 */
public class CurrentAircraftPanel extends javax.swing.JPanel {

    finalProjMain main;
    /**
     * Creates new form CurrentAircraftPanel
     */
    public CurrentAircraftPanel(finalProjMain main) {
        initComponents();
        this.main = main;
    }
    
    public void updatePanel(Aircraft plane) {
        lblName.setText(plane.getName());
        lblAltitude.setText(Integer.toString(plane.getAltitude()) + " ft");
        lblSpeed.setText(plane.getSpeed() + " knots");
        lblHeading.setText(plane.getHeading() + " degrees");
        lblAirport.setText(plane.getAirport());
        if (plane.isArriving()) {
            lblArriveDepart.setText("Arriving");
        } else {
            lblArriveDepart.setText("Departing");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblArriveDepart = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAltitude = new javax.swing.JLabel();
        lblSpeed = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        lblAirport = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 20)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aircraft in The Air");
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 16)); 
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        jLabel2.setText("Name: ");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        jLabel3.setText("Altitude:");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        jLabel4.setText("Heading: ");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        jLabel5.setText("Speed: ");

        lblArriveDepart.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        lblArriveDepart.setText("Arriving");
        lblArriveDepart.setFont(new java.awt.Font("Lucida Bright", 0, 16));
        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        jLabel6.setText("From:");

        lblName.setText("AA222");
        lblName.setFont(new java.awt.Font("Lucida Bright", 0, 16));
        lblAltitude.setText("20,000 ft");
        lblAltitude.setFont(new java.awt.Font("Lucida Bright", 0, 16));
        lblSpeed.setText("345 knots");
        lblSpeed.setFont(new java.awt.Font("Lucida Bright", 0, 16));
        lblHeading.setText("180 degrees");
        lblHeading.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        lblHeading.setLocation(new java.awt.Point(-32680, -32690));//-32680, -32690

        lblAirport.setText("JFK");
        lblAirport.setFont(new java.awt.Font("Lucida Bright", 0, 16)); 
        jLabel7.setText("Arrive/Depart:");
        jLabel7.setFont(new java.awt.Font("Lucida Bright", 0, 16));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading)
                    .addComponent(lblSpeed)
                    .addComponent(lblAltitude)
                    .addComponent(lblName)
                    .addComponent(lblAirport)
                    .addComponent(lblArriveDepart))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAltitude))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblHeading))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSpeed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArriveDepart)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblAirport))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents



    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAirport;
    private javax.swing.JLabel lblAltitude;
    private javax.swing.JLabel lblArriveDepart;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSpeed;

}
