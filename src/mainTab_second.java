
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.File;



public class mainTab_second extends javax.swing.JFrame {

    public mainTab_second() {
        initComponents();
        
        //Cenetering the screen
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dim = new Dimension(tool.getScreenSize());
        int height = (int) dim.getHeight();
        int width = (int)dim.getWidth();
        setSize(width, height);
        setLocation(width / 2 - getWidth() / 2, height / 2 - getHeight() / 2);
        scaledImage();
    }
    
    
    

    public void scaledImage(){
        ImageIcon icon1 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\NIKITA.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        jLabel9.setIcon(scaledIcon1);
        
        ImageIcon icon2 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\BRIANA.jpg");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        jLabel10.setIcon(scaledIcon2);
        
        ImageIcon icon4 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\MARINA.png");
        Image img4 = icon4.getImage();
        Image imgScale4 = img4.getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
        jLabel15.setIcon(scaledIcon4);
        
        ImageIcon icon5 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\MISRA.jpg");
        Image img5 = icon5.getImage();
        Image imgScale5 = img5.getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(imgScale5);
        jLabel16.setIcon(scaledIcon5);
        
        ImageIcon icon6 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\SALMAN.jpg");
        Image img6 = icon6.getImage();
        Image imgScale6 = img6.getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(imgScale6);
        jLabel17.setIcon(scaledIcon6);
        
        ImageIcon icon7 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\AMY.jpg");
        Image img7 = icon7.getImage();
        Image imgScale7 = img7.getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
        jLabel18.setIcon(scaledIcon7);
        
        /**ARTIST DESCRIPTION*/
        ImageIcon icon3 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\PORTRAIT1.png");
        Image img3 = icon3.getImage();
        Image imgScale3 = img3.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
        jLabel3.setIcon(scaledIcon3);
        
        ImageIcon icon8 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\PORTRAIT2.png");
        Image img8 = icon8.getImage();
        Image imgScale8 = img8.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon(imgScale8);
        jLabel4.setIcon(scaledIcon8);
        
        ImageIcon icon9 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\MARINAPIC.png");
        Image img9 = icon9.getImage();
        Image imgScale9 = img9.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon9 = new ImageIcon(imgScale9);
        jLabel8.setIcon(scaledIcon9);
        
        ImageIcon icon10 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\BHAVNAPIC.png");
        Image img10 = icon10.getImage();
        Image imgScale10 = img10.getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon10 = new ImageIcon(imgScale10);
        jLabel11.setIcon(scaledIcon10);
        
        ImageIcon icon11 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\OIL1.png");
        Image img11 = icon11.getImage();
        Image imgScale11 = img11.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon11 = new ImageIcon(imgScale11);
        jLabel5.setIcon(scaledIcon11);
        
        ImageIcon icon12 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\OIL2.png");
        Image img12 = icon12.getImage();
        Image imgScale12 = img12.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon12 = new ImageIcon(imgScale12);
        jLabel7.setIcon(scaledIcon12);
        
        ImageIcon icon13 = new ImageIcon("C:\\Users\\zbell\\Downloads\\PROGRAMMING FILES_JAVA_MAGBOO PAUL\\finalProject\\src\\ARTWORKS_PIC\\logo.png");
        Image img13 = icon13.getImage();
        Image imgScale13 = img13.getScaledInstance(logoMain.getWidth(), logoMain.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon13 = new ImageIcon(imgScale13);
        logoMain.setIcon(scaledIcon13);    
    }
     
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logoMain = new javax.swing.JLabel();
        landscapeButton = new javax.swing.JButton();
        oilButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        gTf = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        potrait = new javax.swing.JPanel();
        main1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        oilView1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        oilview3 = new javax.swing.JButton();
        portrait1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        portrait2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        landscape = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        landscapeView2 = new javax.swing.JButton();
        landscapeView1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        main2 = new javax.swing.JButton();
        landscape1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        landscape2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        oil = new javax.swing.JPanel();
        oilview6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        oilView5 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        main3 = new javax.swing.JButton();
        oil1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        oil2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(83, 113, 136));

        jPanel2.setBackground(new java.awt.Color(83, 113, 136));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        logoMain.setBackground(new java.awt.Color(255, 255, 255));
        logoMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        landscapeButton.setBackground(new java.awt.Color(238, 238, 238));
        landscapeButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        landscapeButton.setText("LANDSCAPE");
        landscapeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landscapeButtonActionPerformed(evt);
            }
        });

        oilButton.setBackground(new java.awt.Color(238, 238, 238));
        oilButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        oilButton.setText("OIL PAINT");
        oilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(238, 238, 238));
        exitButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(238, 238, 238));
        viewButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        viewButton.setText("PORTRAIT");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(203, 178, 121));
        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TYPE OF ART");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        gTf.setBackground(new java.awt.Color(238, 238, 238));
        gTf.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        gTf.setText("GENERATE");
        gTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gTf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(logoMain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(landscapeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(landscapeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(gTf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(241, 211, 179));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel3.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1292, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        jPanel3.add(mainPanel, "card11");

        potrait.setBackground(new java.awt.Color(225, 212, 187));
        potrait.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        main1.setBackground(new java.awt.Color(203, 178, 121));
        main1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        main1.setText("MAINPAGE");
        main1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main1ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        oilView1.setBackground(new java.awt.Color(238, 238, 238));
        oilView1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        oilView1.setText("VIEW ART");
        oilView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilView1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(83, 113, 136));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 113, 136));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("\"MENTALIST SELF PORTRAIT\"");

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(83, 113, 136));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MALARSTWO AUTORSTWA");

        jLabel13.setBackground(new java.awt.Color(83, 113, 136));
        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(83, 113, 136));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("\"MENTALIST SELF PORTRAIT\"");

        jLabel14.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(83, 113, 136));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MALARSTWO AUTORSTWA");

        oilview3.setBackground(new java.awt.Color(238, 238, 238));
        oilview3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        oilview3.setText("VIEW ART");
        oilview3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilview3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout potraitLayout = new javax.swing.GroupLayout(potrait);
        potrait.setLayout(potraitLayout);
        potraitLayout.setHorizontalGroup(
            potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(potraitLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(oilView1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oilview3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, potraitLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, potraitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main1)
                .addContainerGap())
        );
        potraitLayout.setVerticalGroup(
            potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(potraitLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(potraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oilView1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oilview3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(main1)
                .addContainerGap())
        );

        jPanel3.add(potrait, "card2");

        portrait1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout portrait1Layout = new javax.swing.GroupLayout(portrait1);
        portrait1.setLayout(portrait1Layout);
        portrait1Layout.setHorizontalGroup(
            portrait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portrait1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        portrait1Layout.setVerticalGroup(
            portrait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portrait1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(portrait1, "card2");

        portrait2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout portrait2Layout = new javax.swing.GroupLayout(portrait2);
        portrait2.setLayout(portrait2Layout);
        portrait2Layout.setHorizontalGroup(
            portrait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portrait2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        portrait2Layout.setVerticalGroup(
            portrait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portrait2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(portrait2, "card2");

        landscape.setBackground(new java.awt.Color(225, 212, 187));
        landscape.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        landscapeView2.setBackground(new java.awt.Color(238, 238, 238));
        landscapeView2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        landscapeView2.setText("VIEW ART");
        landscapeView2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landscapeView2ActionPerformed(evt);
            }
        });

        landscapeView1.setBackground(new java.awt.Color(238, 238, 238));
        landscapeView1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        landscapeView1.setText("VIEW ART");
        landscapeView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landscapeView1ActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(83, 113, 136));
        jLabel19.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(83, 113, 136));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("SAATCHI ART");

        jLabel20.setBackground(new java.awt.Color(83, 113, 136));
        jLabel20.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(83, 113, 136));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("LANDSCHAFT MIT BLUMEN");

        main2.setBackground(new java.awt.Color(203, 178, 121));
        main2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        main2.setText("MAINPAGE");
        main2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout landscapeLayout = new javax.swing.GroupLayout(landscape);
        landscape.setLayout(landscapeLayout);
        landscapeLayout.setHorizontalGroup(
            landscapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landscapeLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(landscapeView1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(landscapeView2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(landscapeLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(landscapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(landscapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landscapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main2)
                .addContainerGap())
        );
        landscapeLayout.setVerticalGroup(
            landscapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landscapeLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(landscapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(landscapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(33, 33, 33)
                .addGroup(landscapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(landscapeView1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(landscapeView2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(main2)
                .addContainerGap())
        );

        jPanel3.add(landscape, "card2");

        landscape1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout landscape1Layout = new javax.swing.GroupLayout(landscape1);
        landscape1.setLayout(landscape1Layout);
        landscape1Layout.setHorizontalGroup(
            landscape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landscape1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        landscape1Layout.setVerticalGroup(
            landscape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landscape1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(landscape1, "card2");

        landscape2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout landscape2Layout = new javax.swing.GroupLayout(landscape2);
        landscape2.setLayout(landscape2Layout);
        landscape2Layout.setHorizontalGroup(
            landscape2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landscape2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        landscape2Layout.setVerticalGroup(
            landscape2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landscape2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(landscape2, "card2");

        oil.setBackground(new java.awt.Color(225, 212, 187));
        oil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        oilview6.setBackground(new java.awt.Color(238, 238, 238));
        oilview6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        oilview6.setText("VIEW ART");
        oilview6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilview6ActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        oilView5.setBackground(new java.awt.Color(238, 238, 238));
        oilView5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        oilView5.setText("VIEW ART");
        oilView5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilView5ActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(83, 113, 136));
        jLabel21.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(83, 113, 136));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("THE GATHERING");

        jLabel22.setBackground(new java.awt.Color(83, 113, 136));
        jLabel22.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(83, 113, 136));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("THE GREAT AMERICAN FACT");

        main3.setBackground(new java.awt.Color(203, 178, 121));
        main3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        main3.setText("MAINPAGE");
        main3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oilLayout = new javax.swing.GroupLayout(oil);
        oil.setLayout(oilLayout);
        oilLayout.setHorizontalGroup(
            oilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oilLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(oilView5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oilview6, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(oilLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(oilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(oilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main3)
                .addContainerGap())
        );
        oilLayout.setVerticalGroup(
            oilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oilLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(oilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(oilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(34, 34, 34)
                .addGroup(oilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oilView5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oilview6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(main3)
                .addContainerGap())
        );

        jPanel3.add(oil, "card2");

        oil1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout oil1Layout = new javax.swing.GroupLayout(oil1);
        oil1.setLayout(oil1Layout);
        oil1Layout.setHorizontalGroup(
            oil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oil1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        oil1Layout.setVerticalGroup(
            oil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oil1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(oil1, "card2");

        oil2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout oil2Layout = new javax.swing.GroupLayout(oil2);
        oil2.setLayout(oil2Layout);
        oil2Layout.setHorizontalGroup(
            oil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oil2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        oil2Layout.setVerticalGroup(
            oil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oil2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(oil2, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // removing panel j3
       jPanel3.removeAll();
       jPanel3.repaint();
       jPanel3.revalidate();
       // add panel j3
       jPanel3.add(potrait);
       jPanel3.repaint();
       jPanel3.revalidate();
    }//GEN-LAST:event_viewButtonActionPerformed

    private void landscapeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landscapeButtonActionPerformed
        // removing panel j3
       jPanel3.removeAll();
       jPanel3.repaint();
       jPanel3.revalidate();
       // add panel j3
       jPanel3.add(landscape);
       jPanel3.repaint();
       jPanel3.revalidate();
    }//GEN-LAST:event_landscapeButtonActionPerformed

    private void oilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilButtonActionPerformed
        // removing panel j3
       jPanel3.removeAll();
       jPanel3.repaint();
       jPanel3.revalidate();
       // add panel j3
       jPanel3.add(oil);
       jPanel3.repaint();
       jPanel3.revalidate();
    }//GEN-LAST:event_oilButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void main1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main1ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(mainPanel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_main1ActionPerformed

    private void oilView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilView1ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
       // add panel j3
        jPanel3.add(portrait1);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_oilView1ActionPerformed

    private void oilview6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilview6ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(oil2);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_oilview6ActionPerformed

    private void oilView5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilView5ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(oil1);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_oilView5ActionPerformed

    private void landscapeView2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landscapeView2ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(landscape2);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_landscapeView2ActionPerformed

    private void landscapeView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landscapeView1ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(landscape1);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_landscapeView1ActionPerformed

    private void oilview3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilview3ActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(portrait2);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_oilview3ActionPerformed

    private void main2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main2ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(mainPanel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_main2ActionPerformed

    private void main3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main3ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        // add panel j3
        jPanel3.add(mainPanel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_main3ActionPerformed

    private void gTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gTfActionPerformed
       firstTab jf2 = new firstTab();
       jf2.show();
       dispose();
    }//GEN-LAST:event_gTfActionPerformed

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
            java.util.logging.Logger.getLogger(mainTab_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainTab_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainTab_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainTab_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainTab_second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel landscape;
    private javax.swing.JPanel landscape1;
    private javax.swing.JPanel landscape2;
    private javax.swing.JButton landscapeButton;
    private javax.swing.JButton landscapeView1;
    private javax.swing.JButton landscapeView2;
    private javax.swing.JLabel logoMain;
    private javax.swing.JButton main1;
    private javax.swing.JButton main2;
    private javax.swing.JButton main3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel oil;
    private javax.swing.JPanel oil1;
    private javax.swing.JPanel oil2;
    private javax.swing.JButton oilButton;
    private javax.swing.JButton oilView1;
    private javax.swing.JButton oilView5;
    private javax.swing.JButton oilview3;
    private javax.swing.JButton oilview6;
    private javax.swing.JPanel portrait1;
    private javax.swing.JPanel portrait2;
    private javax.swing.JPanel potrait;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
