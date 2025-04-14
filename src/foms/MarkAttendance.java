package foms;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.sql.*;
import dao.ConnectionProvider;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import utility.DBUtility;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MarkAttendance extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private ExecutorService executor = Executors.newSingleThreadExecutor(this);
    private volatile boolean running = true;

    public MarkAttendance() {
        initComponents();
        DBUtility.SetImage(this, "/utility/images/A.jpg", 1024, 600);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.YELLOW));

        initWebcam();
        Timer timer = new Timer(1, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        SimpleDateFormat simpledatformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        lbltime.setText(simpledatformat.format(new Date()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        webcamview = new javax.swing.JPanel();
        lblimage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblchackincheckout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mark Attandence");

        javax.swing.GroupLayout webcamviewLayout = new javax.swing.GroupLayout(webcamview);
        webcamview.setLayout(webcamviewLayout);
        webcamviewLayout.setHorizontalGroup(
            webcamviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        webcamviewLayout.setVerticalGroup(
            webcamviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        lblimage.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time");

        lbltime.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 255, 255));
        lbltime.setText("Time");

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblchackincheckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(webcamview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbltime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(161, 161, 161))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblchackincheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(418, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336)
                .addComponent(btnExit)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbltime)
                        .addGap(26, 26, 26)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblchackincheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(webcamview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblchackincheckout;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltime;
    private javax.swing.JPanel webcamview;
    // End of variables declaration//GEN-END:variables

    Map<String, String> resultMap = new HashMap<String, String>();

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ex) {

            }
            try {
                Result result = null;
                BufferedImage image = null;
                if (webcam.isOpen()) {
                    if ((image = webcam.getImage()) == null) {
                        continue;
                    }
                }
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                try {
                    result = new MultiFormatReader().decode(bitmap);

                } catch (NotFoundException ex) {

                }
                if (result != null) {
                    String jsonString = result.getText();
                    Gson gson = new Gson();
                    java.lang.reflect.Type type = new TypeToken<Map<String, String>>() {
                    }.getType();
                    resultMap = gson.fromJson(jsonString, type);

                    String finalpath = DBUtility.getPath("images\\" + resultMap.get("email") + ".jpg");
                    CircularImageFrame(finalpath);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (running);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }

    private void stopWebcame() {
        if (webcam != null && webcam.isOpen()) {
            webcam.close();
        }
    }

    private void initWebcam() {
        webcam = Webcam.getDefault();
        if (webcam != null) {
            Dimension[] resolution = webcam.getViewSizes();
            Dimension Maxresolution = resolution[resolution.length - 1];

            if (webcam.open()) {
                webcam.close();
            }
            webcam.setViewSize(Maxresolution);
            webcam.open();
            panel = new WebcamPanel(webcam);
            panel.setPreferredSize(Maxresolution);
            panel.setFPSDisplayed(true);
            webcamview.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 495, 386));
            executor.execute(this);
            executor.shutdown();
        } else {
            System.out.println("Issue with Webcam!");
        }

    }
    private BufferedImage imagee = null;

    private void CircularImageFrame(String imagepath) {
        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM userdetails WHERE email='" + resultMap.get("email") + "';");
            if (!rs.next()) {
                showPopUpForCertainDuration("User is not registrated or Deleted", "Invalid Qr", JOptionPane.ERROR_MESSAGE);
                return;
            }
            imagee = null;
            File imageFile = new File(imagepath);
            if (imageFile.exists()) {
                try {
                    imagee = ImageIO.read(new File(imagepath));
                    imagee = createCircularImage(imagee);
                    ImageIcon icon = new ImageIcon(imagee);
                    lblimage.setIcon(icon);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                BufferedImage imagees = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = imagees.createGraphics();
                g2d.setColor(Color.BLACK);
                g2d.fillOval(25, 25, 250, 250);
                g2d.setFont(new Font("Serif", Font.BOLD, 250));
                g2d.setColor(Color.WHITE);
                g2d.drawString(String.valueOf(resultMap.get("name").charAt(0)).toUpperCase(), 75, 225);
                g2d.dispose();

                ImageIcon newImageIcon = new ImageIcon(imagees);
                lblimage.setIcon(newImageIcon);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.pack();
                this.setLocation(null);
                this.setVisible(true);

            }
            lblimage.setHorizontalAlignment(JLabel.CENTER);
            lblname.setText(resultMap.get("name"));
            if (!checkInCheckOut()) {
                return;
            }

        } catch (Exception ex) {

        }
    }

    private void showPopUpForCertainDuration(String user_is_not_registrated_or_Deleted, String invalid_Qr, int ERROR_MESSAGE) {

    }

    private BufferedImage createCircularImage(BufferedImage imagee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean checkInCheckOut() throws HeadlessException, SQLException, Exception {
        String popUpHeader = null;
        String popUpMassage = null;
        Color color = null;
        Connection con = ConnectionProvider.getcon();
        Statement st = con.createStatement();
        LocalDate currentdate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ResultSet rs = st.executeQuery("SELECT * FROM  userattendance WHERE date ='" + currentdate.format(dateFormatter) + "' user_id =" + Integer.valueOf(resultMap.get("id")) + ";");
        Connection connection = ConnectionProvider.getcon();
        if (rs.next()) {
            String checkOutDateTime = rs.getString(4);
            if (checkOutDateTime != null) {
                popUpMassage = "Already CheckOut For the Day";
                popUpHeader = "Invalid CheckOut";
                showPopUpForCertainDuration(popUpMassage, popUpHeader, JOptionPane.ERROR_MESSAGE);
                return false;
            }
            String checkInDateTime = rs.getString(3);
            LocalDateTime checkInLocalDateTime = LocalDateTime.parse(checkInDateTime, dateTimeFormatter);
            Duration duration = Duration.between(checkInLocalDateTime, currentDateTime);
            Long hours = duration.toHours();
            Long minutes = duration.minusHours(hours).toMinutes();
            long seconds = duration.minusHours(hours).minusMinutes(minutes).toSeconds();

            if (!(hours >= 0 || (hours == 0) && minutes >= 5)) {
                long remainingMinutes = 4 - minutes;
                long remainingseconds = 60 - seconds;
                popUpMassage = String.format("Your Work Duration is less than 5 minutes \nYou can check out after %d minutes %d second", remainingMinutes, remainingseconds);
                popUpHeader = "Duration Warning ";
                showPopUpForCertainDuration(popUpMassage, popUpHeader, JOptionPane.WARNING_MESSAGE);
                return false;

            }
            String updateQuerry = "update userattendance set checkOut=?,workDuration=?,WHERE date=? and user_id=?";
            PreparedStatement ps = connection.prepareStatement(updateQuerry);
            ps.setString(1, currentDateTime.format(dateFormatter));
            ps.setString(2, "" + hours + " Hours and " + minutes + " minutes");
            ps.setString(3, currentdate.format(dateFormatter));
            ps.setString(4, resultMap.get("id"));
            ps.executeUpdate();
            popUpHeader = "CheckOut";
            popUpMassage = "Check Out at " + currentDateTime.format(dateFormatter) + "\nWork duration" + hours + "Hours and" + minutes + "Minutes";
            color =Color.RED;
            

        }else{
//            CheckIn
        }

    }
}
