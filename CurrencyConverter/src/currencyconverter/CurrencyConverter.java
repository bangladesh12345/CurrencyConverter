package currencyconverter;

import java.awt.Color;
import java.text.DecimalFormat;

public class CurrencyConverter extends javax.swing.JFrame {

    public final double ArgentinePeso = 17.739695;
    public final double AustralianDollar = 1.268218;
    public final double BahrainiDinar = 0.377118;
    public final double BangladeshiTaka = 80.90;
    public final double BotswanaPula = 10.298240;
    public final double BrazilianReal = 3.157494;
    public final double BritishPound = 0.770628;
    public final double BruneianDollar = 1.363193;
    public final double BulgarianLev = 1.664646;
    public final double CanadianDollar = 1.272480;
    public final double IndianRupee = 64.129761;
    public final double JapaneseYen = 109.309259;
    public final double SingaporeDollar = 1.363020;
    public final double ChileanPeso = 647.963980;
    public final double ColombianPeso = 2993.515421;
    public final double DanishKrone = 6.298116;
    public final double Euro = 0.846837;
    public final double HungarianForint = 258.447000;
    public final double IndonesianRupiah = 13361.608067;
    public final double IranianRial = 32887.529084;
    public final double IsraeliShekel = 3.582538;
    public final double KazakhstaniTenge = 332.755105;
    public final double KuwaitiDinar = 0.302003;
    public final double LibyanDinar = 1.347883;
    public final double MalaysianRinggit = 4.295649;
    public final double MexicanPeso = 17.880427;
    public final double NepaleseRupee = 102.543672;
    public final double NewZealandDollar = 1.369664;
    public final double NorwegianKrone = 7.954728;
    public final double PakistaniRupee = 105.316888;
    public final double PhilippinePeso = 51.010809;
    public final double QatariRiyal = 3.640928;
    public final double RussianRuble = 59.922470;
    public final double SaudiArabianRiyal = 3.750248;
    public final double SouthAfricanRand = 13.431933;
    public final double SouthKoreanWon = 1142.992381;
    public final double SriLankanRupee = 153.051797;
    public final double SwedishKrona = 8.127233;
    public final double TaiwanNewDollar = 30.351738;
    public final double ThaiBaht = 33.228663;
    public final double TurkishLira = 3.538268;
    public final double USDollar = 1;
    public final double GermanMark = 1.72;
    public final double GhanaianCedi = 4.41;
    public final double JamaicanDollar = 127.90;
    public final double NigerianNaira = 365.18;
    public final double SierraLeoneanLeone = 7600.00;
    public final double SomaliShilling = 576.21;
    public final double SudanesePound = 6.65;
    public final double UgandanShilling = 3602.00;
    public double x, y, w, z;

    public CurrencyConverter() {
        initComponents();
        this.getContentPane().setBackground(Color.CYAN);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conv = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        conv.setText("Convert");
        conv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CURRENCY CONVERTER");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 255, 255))); // NOI18N

        t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "Argentine Peso", "Australian Dollar", "Bahraini Dinar", "Bangladeshi Taka", "Botswana Pula", "Brazilian Real", "British Pound ", "Bruneian Dollar", "Bulgarian Lev ", "Canadian Dollar", "Chilean Peso", "Colombian Peso", "Danish Krone", "Euro", "German Mark ", "Ghanaian Cedi", "Hungarian Forint", "Indonesian Rupiah", "Iranian Rial", "Israeli Shekel", "Indian Rupee ", "Japanese Yen", "Jamaican Dollar", "KazakhstaniTenge", "Kuwaiti Dinar", "Libyan Dinar", "Malaysian Ringgit", "Mexican Peso", "Nepalese Rupee", "NewZealand Dollar", "Norwegian Krone", "Nigerian Naira", "Pakistani Rupee", "Philippine Peso", "Qatari Riyal", "Russian Ruble", "Saudi Arabian Riyal ", "South African Rand", "South Korean Won", "Sri Lankan Rupee", "Singapore Dollar ", "Swedish Krona ", "Sierra Leonean Leone", "Somali Shilling", "Sudanese Pound", "Taiwan New Dollar", "Thai Baht ", "Turkish Lira ", "US Dollar", "Ugandan Shilling" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "Argentine Peso", "Australian Dollar", "Bahraini Dinar", "Bangladeshi Taka", "Botswana Pula", "Brazilian Real", "British Pound", "Bruneian Dollar", "Bulgarian Lev", "Canadian Dollar", "Chilean Peso", "Colombian Peso", "Danish Krone", "Euro", "German Mark", "Ghanaian Cedi", "Hungarian Forint", "Indonesian Rupiah", "Iranian Rial", "Israeli Shekel", "Indian Rupee", "Japanese Yen", "Jamaican Dollar", "KazakhstaniTenge", "Kuwaiti Dinar", "Libyan Dinar", "Malaysian Ringgit", "Mexican Peso", "Nepalese Rupee", "NewZealand Dollar", "Norwegian Krone", "Nigerian Naira", "Pakistani Rupee", "Philippine Peso", "Qatari Riyal", "Russian Ruble", "Saudi Arabian Riyal", "South African Rand", "South Korean Won", "Sri Lankan Rupee", "Singapore Dollar", "Swedish Krona", "Sierra Leonean Leone", "Somali Shilling", "Sudanese Pound", "Taiwan New Dollar", "Thai Baht ", "Turkish Lira", "US Dollar", "Ugandan Shilling" }));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/currencyconverter/download.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(conv, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 58, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conv, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convActionPerformed
        String a = c1.getSelectedItem().toString();
        String b = c2.getSelectedItem().toString();
        String c = t1.getText();
        double i = c.length();
        if (!"Choose One".equals(a) && !"Choose One".equals(b) && i != 0) {
            double d = Double.parseDouble(c);
            if ("Argentine Peso".equals(a)) {
                x = d / this.ArgentinePeso;
                w = 1 / this.ArgentinePeso;
            } else if ("Australian Dollar".equals(a)) {
                x = d / this.AustralianDollar;
                w = 1 / this.AustralianDollar;
            } else if ("Bahraini Dinar".equals(a)) {
                x = d / this.BahrainiDinar;
                w = 1 / this.BahrainiDinar;
            } else if ("Bulgarian Lev".equals(a)) {
                x = d / this.BulgarianLev;
                w = 1 / this.BulgarianLev;
            } else if ("Bangladeshi Taka".equals(a)) {
                x = d / this.BangladeshiTaka;
                w = 1 / this.BangladeshiTaka;
            } else if ("Botswana Pula".equals(a)) {
                x = d / this.BotswanaPula;
                w = 1 / this.BotswanaPula;
            } else if ("Brazilian Real".equals(a)) {
                x = d / this.BrazilianReal;
                w = 1 / this.BrazilianReal;
            } else if ("British Pound".equals(a)) {
                x = d / this.BritishPound;
                w = 1 / this.BritishPound;
            } else if ("Bruneian Dollar".equals(a)) {
                x = d / this.BruneianDollar;
                w = 1 / this.BruneianDollar;
            } else if ("Canadian Dollar".equals(a)) {
                x = d / this.CanadianDollar;
                w = 1 / this.CanadianDollar;
            } else if ("Indian Rupee".equals(a)) {
                x = d / this.IndianRupee;
                w = 1 / this.IndianRupee;
            } else if ("Japanese Yen".equals(a)) {
                x = d / this.JapaneseYen;
                w = 1 / this.JapaneseYen;
            } else if ("Singapore Dollar".equals(a)) {
                x = d / this.SingaporeDollar;
                w = 1 / this.SingaporeDollar;
            } else if ("Chilean Peso".equals(a)) {
                x = d / this.ChileanPeso;
                w = 1 / this.ChileanPeso;
            } else if ("Colombian Peso".equals(a)) {
                x = d / this.ColombianPeso;
                w = 1 / this.ColombianPeso;
            } else if ("Danish Krone".equals(a)) {
                x = d / this.DanishKrone;
                w = 1 / this.DanishKrone;
            } else if ("Euro".equals(a)) {
                x = d / this.Euro;
                w = 1 / this.Euro;
            } else if ("Hungarian Forint".equals(a)) {
                x = d / this.HungarianForint;
                w = 1 / this.HungarianForint;
            } else if ("Indonesian Rupiah".equals(a)) {
                x = d / this.IndonesianRupiah;
                w = 1 / this.IndonesianRupiah;
            } else if ("Iranian Rial".equals(a)) {
                x = d / this.IranianRial;
                w = 1 / this.IranianRial;
            } else if ("Israeli Shekel".equals(a)) {
                x = d / this.IsraeliShekel;
                w = 1 / this.IsraeliShekel;
            } else if ("Kazakhstani Tenge".equals(a)) {
                x = d / this.KazakhstaniTenge;
                w = 1 / this.KazakhstaniTenge;
            } else if ("Kuwaiti Dinar".equals(a)) {
                x = d / this.KuwaitiDinar;
                w = 1 / this.KuwaitiDinar;
            } else if ("Libyan Dinar".equals(a)) {
                x = d / this.LibyanDinar;
                w = 1 / this.LibyanDinar;
            } else if ("Malaysian Ringgit".equals(a)) {
                x = d / this.MalaysianRinggit;
                w = 1 / this.MalaysianRinggit;
            } else if ("Mexican Peso".equals(a)) {
                x = d / this.MexicanPeso;
                w = 1 / this.MexicanPeso;
            } else if ("Nepalese Rupee".equals(a)) {
                x = d / this.NepaleseRupee;
                w = 1 / this.NepaleseRupee;
            } else if ("New Zealand Dollar".equals(a)) {
                x = d / this.NewZealandDollar;
                w = 1 / this.NewZealandDollar;
            } else if ("Norwegian Krone".equals(a)) {
                x = d / this.NorwegianKrone;
                w = 1 / this.NorwegianKrone;
            } else if ("Pakistani Rupee".equals(a)) {
                x = d / this.PakistaniRupee;
                w = 1 / this.PakistaniRupee;
            } else if ("Philippine Peso".equals(a)) {
                x = d / this.PhilippinePeso;
                w = 1 / this.PhilippinePeso;
            } else if ("Qatari Riyal".equals(a)) {
                x = d / this.QatariRiyal;
                w = 1 / this.QatariRiyal;
            } else if ("Russian Ruble".equals(a)) {
                x = d / this.RussianRuble;
                w = 1 / this.RussianRuble;
            } else if ("Saudi Arabian Riyal".equals(a)) {
                x = d / this.SaudiArabianRiyal;
                w = 1 / this.SaudiArabianRiyal;
            } else if ("South African Rand".equals(a)) {
                x = d / this.SouthAfricanRand;
                w = 1 / this.SouthAfricanRand;
            } else if ("South Korean Won".equals(a)) {
                x = d / this.SouthKoreanWon;
                w = 1 / this.SouthKoreanWon;
            } else if ("Sri Lankan Rupee".equals(a)) {
                x = d / this.SriLankanRupee;
                w = 1 / this.SriLankanRupee;
            } else if ("Swedish Krona".equals(a)) {
                x = d / this.SwedishKrona;
                w = 1 / this.SwedishKrona;
            } else if ("Singapore Dollar".equals(a)) {
                x = d / this.SingaporeDollar;
                w = 1 / this.SingaporeDollar;
            } else if ("Taiwan New Dollar".equals(a)) {
                x = d / this.TaiwanNewDollar;
                w = 1 / this.TaiwanNewDollar;
            } else if ("Thai Baht".equals(a)) {
                x = d / this.ThaiBaht;
                w = 1 / this.ThaiBaht;
            } else if ("Turkish Lira".equals(a)) {
                x = d / this.TurkishLira;
                w = 1 / this.TurkishLira;
            } else if ("US Dollar".equals(a)) {
                x = d / this.USDollar;
                w = 1 / this.USDollar;
            } else if ("German Mark".equals(a)) {
                x = d / this.GermanMark;
                w = 1 / this.GermanMark;
            } else if ("Ghanaian Cedi".equals(a)) {
                x = d / this.GhanaianCedi;
                w = 1 / this.GhanaianCedi;
            } else if ("Jamaican Dollar".equals(a)) {
                x = d / this.JamaicanDollar;
                w = 1 / this.JamaicanDollar;
            } else if ("Nigerian Naira".equals(a)) {
                x = d / this.NigerianNaira;
                w = 1 / this.NigerianNaira;
            } else if ("Sierra Leonean Leone".equals(a)) {
                x = d / this.SierraLeoneanLeone;
                w = 1 / this.SierraLeoneanLeone;
            } else if ("Somali Shilling".equals(a)) {
                x = d / this.SomaliShilling;
                w = 1 / this.SomaliShilling;
            } else if ("Sudanese Pound".equals(a)) {
                x = d / this.SudanesePound;
                w = 1 / this.SudanesePound;
            } else if ("Ugandan Shilling".equals(a)) {
                x = d / this.UgandanShilling;
                w = 1 / this.UgandanShilling;
            }

            if ("Argentine Peso".equals(b)) {
                y = x * this.ArgentinePeso;
                z = w * this.ArgentinePeso;
            } else if ("Australian Dollar".equals(b)) {
                y = x * this.AustralianDollar;
                z = w * this.AustralianDollar;
            } else if ("Bahraini Dinar".equals(b)) {
                y = x * this.BahrainiDinar;
                z = w * this.BahrainiDinar;
            } else if ("Bulgarian Lev".equals(b)) {
                y = x * this.BulgarianLev;
                z = w * this.BulgarianLev;
            } else if ("Bangladeshi Taka".equals(b)) {
                y = x * this.BangladeshiTaka;
                z = w * this.BangladeshiTaka;
            } else if ("Botswana Pula".equals(b)) {
                y = x * this.BotswanaPula;
                z = w * this.BotswanaPula;
            } else if ("Brazilian Real".equals(b)) {
                y = x * this.BrazilianReal;
                z = w * this.BrazilianReal;
            } else if ("British Pound".equals(b)) {
                y = x * this.BritishPound;
                z = w * this.BritishPound;
            } else if ("Bruneian Dollar".equals(b)) {
                y = x * this.BruneianDollar;
                z = w * this.BruneianDollar;
            } else if ("Canadian Dollar".equals(b)) {
                y = x * this.CanadianDollar;
                z = w * this.CanadianDollar;
            } else if ("Indian Rupee".equals(b)) {
                y = x * this.IndianRupee;
                z = w * this.IndianRupee;
            } else if ("Japanese Yen".equals(b)) {
                y = x * this.JapaneseYen;
                z = w * this.JapaneseYen;
            } else if ("Singapore Dollar".equals(b)) {
                y = x * this.SingaporeDollar;
                z = w * this.SingaporeDollar;
            } else if ("Chilean Peso".equals(b)) {
                y = x * this.ChileanPeso;
                z = w * this.ChileanPeso;
            } else if ("Colombian Peso".equals(b)) {
                y = x * this.ColombianPeso;
                z = w * this.ColombianPeso;
            } else if ("Danish Krone".equals(b)) {
                y = x * this.DanishKrone;
                z = w * this.DanishKrone;
            } else if ("Euro".equals(b)) {
                y = x * this.Euro;
                z = w * this.Euro;
            } else if ("Hungarian Forint".equals(b)) {
                y = x * this.HungarianForint;
                z = w * this.HungarianForint;
            } else if ("Indonesian Rupiah".equals(b)) {
                y = x * this.IndonesianRupiah;
                z = w * this.IndonesianRupiah;
            } else if ("Iranian Rial".equals(b)) {
                y = x * this.IranianRial;
                z = w * this.IranianRial;
            } else if ("Israeli Shekel".equals(b)) {
                y = x * this.IsraeliShekel;
                z = w * this.IsraeliShekel;
            } else if ("Kazakhstani Tenge".equals(b)) {
                y = x * this.KazakhstaniTenge;
                z = w * this.KazakhstaniTenge;
            } else if ("Kuwaiti Dinar".equals(b)) {
                y = x * this.KuwaitiDinar;
                z = w * this.KuwaitiDinar;
            } else if ("Libyan Dinar".equals(b)) {
                y = x * this.LibyanDinar;
                z = w * this.LibyanDinar;
            } else if ("Malaysian Ringgit".equals(b)) {
                y = x * this.MalaysianRinggit;
                z = w * this.MalaysianRinggit;
            } else if ("Mexican Peso".equals(b)) {
                y = x * this.MexicanPeso;
                z = w * this.MexicanPeso;
            } else if ("Nepalese Rupee".equals(b)) {
                y = x * this.NepaleseRupee;
                z = w * this.NepaleseRupee;
            } else if ("New Zealand Dollar".equals(b)) {
                y = x * this.NewZealandDollar;
                z = w * this.NewZealandDollar;
            } else if ("Norwegian Krone".equals(b)) {
                y = x * this.NorwegianKrone;
                z = w * this.NorwegianKrone;
            } else if ("Pakistani Rupee".equals(b)) {
                y = x * this.PakistaniRupee;
                z = w * this.PakistaniRupee;
            } else if ("Philippine Peso".equals(b)) {
                y = x * this.PhilippinePeso;
                z = w * this.PhilippinePeso;
            } else if ("Qatari Riyal".equals(b)) {
                y = x * this.QatariRiyal;
                z = w * this.QatariRiyal;
            } else if ("Russian Ruble".equals(b)) {
                y = x * this.RussianRuble;
                z = w * this.RussianRuble;
            } else if ("Saudi Arabian Riyal".equals(b)) {
                y = x * this.SaudiArabianRiyal;
                z = w * this.SaudiArabianRiyal;
            } else if ("South African Rand".equals(b)) {
                y = x * this.SouthAfricanRand;
                z = w * this.SouthAfricanRand;
            } else if ("South Korean Won".equals(b)) {
                y = x * this.SouthKoreanWon;
                z = w * this.SouthKoreanWon;
            } else if ("Sri Lankan Rupee".equals(b)) {
                y = x * this.SriLankanRupee;
                z = w * this.SriLankanRupee;
            } else if ("Swedish Krona".equals(b)) {
                y = x * this.SwedishKrona;
                z = w * this.SwedishKrona;
            } else if ("Singapore Dollar".equals(b)) {
                y = x * this.SingaporeDollar;
                z = w * this.SingaporeDollar;
            } else if ("Taiwan New Dollar".equals(b)) {
                y = x * this.TaiwanNewDollar;
                z = w * this.TaiwanNewDollar;
            } else if ("Thai Baht".equals(b)) {
                y = x * this.ThaiBaht;
                z = w * this.ThaiBaht;
            } else if ("Turkish Lira".equals(b)) {
                y = x * this.TurkishLira;
                z = w * this.TurkishLira;
            } else if ("US Dollar".equals(b)) {
                y = x * this.USDollar;
                z = w * this.USDollar;
            } else if ("German Mark".equals(b)) {
                y = x * this.GermanMark;
                z = w * this.GermanMark;
            } else if ("Ghanaian Cedi".equals(b)) {
                y = x * this.GhanaianCedi;
                z = w * this.GhanaianCedi;
            } else if ("Jamaican Dollar".equals(b)) {
                y = x * this.JamaicanDollar;
                z = w * this.JamaicanDollar;
            } else if ("Nigerian Naira".equals(b)) {
                y = x * this.NigerianNaira;
                z = w * this.NigerianNaira;
            } else if ("Sierra Leonean Leone".equals(b)) {
                y = x * this.SierraLeoneanLeone;
                z = w * this.SierraLeoneanLeone;
            } else if ("Somali Shilling".equals(b)) {
                y = x * this.SomaliShilling;
                z = w * this.SomaliShilling;
            } else if ("Sudanese Pound".equals(b)) {
                y = x * this.SudanesePound;
                z = w * this.SudanesePound;
            } else if ("Ugandan Shilling".equals(b)) {
                y = x * this.UgandanShilling;
                z = w * this.UgandanShilling;
            }

            DecimalFormat ti = new DecimalFormat("#.000");
            String tu = ti.format(y);
            DecimalFormat s = new DecimalFormat("#.000");
            String t = s.format(z);
            t2.setText(tu);
            l1.setText("1 " + c1.getSelectedItem().toString() + " = " + t + " " + c2.getSelectedItem().toString());
        } else {
            l1.setText("You haven't entered anything");
            t1.setText(null);
            t2.setText(null);
        }
    }//GEN-LAST:event_convActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        t1.setText(null);
        t2.setText(null);
        l1.setText(null);
        c1.setSelectedIndex(0);
        c2.setSelectedIndex(0);
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JButton conv;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
