/*     */ package gui;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.net.URL;
/*     */ import java.util.Enumeration;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.JTextPane;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import javax.swing.table.TableCellEditor;
/*     */ import javax.swing.text.SimpleAttributeSet;
/*     */ import javax.swing.text.StyleConstants;
/*     */ import javax.swing.text.StyledDocument;
/*     */ import non_gui.Player;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Character_Creation
/*     */   extends JFrame
/*     */ {
/*     */   private JPanel contentPane;
/*     */   private JTextField textField_first;
/*     */   private JTextField textField_last;
/*     */   private JTextField textField_1;
/*     */   private JTextField textField_2;
/*     */   private JTextField textField_3;
/*     */   private JTextField textField_4;
/*     */   private JTextField textField_5;
/*     */   private JTextField textField_6;
/*     */   
/*     */   public Character_Creation() {
/*  52 */     setDefaultCloseOperation(3);
/*  53 */     setBounds(100, 100, 1050, 600);
/*  54 */     this.contentPane = new JPanel();
/*  55 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  56 */     setContentPane(this.contentPane);
/*  57 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  59 */     Main.p = new Player();
/*     */     
/*  61 */     JLabel label = new JLabel("____________________________________");
/*  62 */     label.setHorizontalTextPosition(0);
/*  63 */     label.setHorizontalAlignment(0);
/*  64 */     label.setBounds(-27, 173, 358, 16);
/*  65 */     this.contentPane.add(label);
/*     */     
/*  67 */     JLabel lblGender = new JLabel("GENDER*");
/*  68 */     lblGender.setFont(new Font("Lucida Grande", 1, 13));
/*  69 */     lblGender.setBounds(21, 21, 61, 16);
/*  70 */     this.contentPane.add(lblGender);
/*     */     
/*  72 */     JLabel lblName = new JLabel("NAME");
/*  73 */     lblName.setFont(new Font("Lucida Grande", 1, 13));
/*  74 */     lblName.setBounds(106, 21, 118, 16);
/*  75 */     this.contentPane.add(lblName);
/*     */     
/*  77 */     JLabel lblLastName = new JLabel("FIRST:");
/*  78 */     lblLastName.setBounds(118, 50, 43, 16);
/*  79 */     this.contentPane.add(lblLastName);
/*     */     
/*  81 */     JLabel lblLast = new JLabel("LAST:");
/*  82 */     lblLast.setHorizontalAlignment(11);
/*  83 */     lblLast.setBounds(113, 78, 43, 16);
/*  84 */     this.contentPane.add(lblLast);
/*     */     
/*  86 */     JLabel lblArts = new JLabel("CREATIVITY");
/*  87 */     lblArts.setFont(new Font("Lucida Grande", 1, 13));
/*  88 */     lblArts.setBounds(315, 21, 103, 16);
/*  89 */     this.contentPane.add(lblArts);
/*     */     
/*  91 */     JLabel lblSports = new JLabel("ACTIVITY");
/*  92 */     lblSports.setFont(new Font("Lucida Grande", 1, 13));
/*  93 */     lblSports.setBounds(537, 21, 116, 16);
/*  94 */     this.contentPane.add(lblSports);
/*     */     
/*  96 */     JLabel lblService = new JLabel("SERVICE");
/*  97 */     lblService.setFont(new Font("Lucida Grande", 1, 13));
/*  98 */     lblService.setBounds(795, 21, 61, 16);
/*  99 */     this.contentPane.add(lblService);
/*     */     
/* 101 */     JLabel lblGroup1 = new JLabel("GROUP 1");
/* 102 */     lblGroup1.setBounds(21, 215, 61, 16);
/* 103 */     this.contentPane.add(lblGroup1);
/*     */     
/* 105 */     JLabel lblGroup2 = new JLabel("GROUP 2");
/* 106 */     lblGroup2.setBounds(21, 265, 61, 16);
/* 107 */     this.contentPane.add(lblGroup2);
/*     */     
/* 109 */     JLabel lblGroup3 = new JLabel("GROUP 3");
/* 110 */     lblGroup3.setBounds(21, 315, 61, 16);
/* 111 */     this.contentPane.add(lblGroup3);
/*     */     
/* 113 */     JLabel lblGroup4 = new JLabel("GROUP 4");
/* 114 */     lblGroup4.setBounds(21, 365, 61, 16);
/* 115 */     this.contentPane.add(lblGroup4);
/*     */     
/* 117 */     JLabel lblGroup5 = new JLabel("GROUP 5");
/* 118 */     lblGroup5.setBounds(21, 415, 61, 16);
/* 119 */     this.contentPane.add(lblGroup5);
/*     */     
/* 121 */     JLabel lblGroup = new JLabel("GROUP 6");
/* 122 */     lblGroup.setBounds(21, 465, 61, 16);
/* 123 */     this.contentPane.add(lblGroup);
/*     */     
/* 125 */     final JRadioButton rdbtnF = new JRadioButton("F");
/* 126 */     rdbtnF.setBounds(21, 47, 141, 23);
/* 127 */     this.contentPane.add(rdbtnF);
/*     */     
/* 129 */     final JRadioButton rdbtnM = new JRadioButton("M");
/* 130 */     rdbtnM.setBounds(21, 73, 141, 23);
/* 131 */     this.contentPane.add(rdbtnM);
/*     */     
/* 133 */     final ButtonGroup genderGroup = new ButtonGroup();
/* 134 */     genderGroup.add(rdbtnM);
/* 135 */     genderGroup.add(rdbtnF);
/*     */ 
/*     */ 
/*     */     
/* 139 */     this.textField_first = new JTextField();
/* 140 */     this.textField_first.setBounds(161, 45, 130, 26);
/* 141 */     this.contentPane.add(this.textField_first);
/* 142 */     this.textField_first.setColumns(10);
/*     */     
/* 144 */     this.textField_last = new JTextField();
/* 145 */     this.textField_last.setColumns(10);
/* 146 */     this.textField_last.setBounds(161, 75, 130, 26);
/* 147 */     this.contentPane.add(this.textField_last);
/*     */     
/* 149 */     JRadioButton chckbxVisualArt = new JRadioButton("Visual Art");
/* 150 */     chckbxVisualArt.setBounds(325, 47, 93, 23);
/* 151 */     this.contentPane.add(chckbxVisualArt);
/*     */     
/* 153 */     JRadioButton chckbxMusic = new JRadioButton("Music");
/* 154 */     chckbxMusic.setBounds(325, 73, 93, 23);
/* 155 */     this.contentPane.add(chckbxMusic);
/*     */     
/* 157 */     JRadioButton chckbxTheater = new JRadioButton("Theater");
/* 158 */     chckbxTheater.setBounds(421, 73, 93, 23);
/* 159 */     this.contentPane.add(chckbxTheater);
/*     */     
/* 161 */     JRadioButton chckbxFilm = new JRadioButton("Film");
/* 162 */     chckbxFilm.setBounds(421, 47, 93, 23);
/* 163 */     this.contentPane.add(chckbxFilm);
/*     */     
/* 165 */     final ButtonGroup cGroup = new ButtonGroup();
/* 166 */     cGroup.add(chckbxVisualArt);
/* 167 */     cGroup.add(chckbxMusic);
/* 168 */     cGroup.add(chckbxTheater);
/* 169 */     cGroup.add(chckbxFilm);
/*     */ 
/*     */     
/* 172 */     JRadioButton chckbxBasketball = new JRadioButton("Basketball");
/* 173 */     chckbxBasketball.setBounds(547, 46, 106, 23);
/* 174 */     this.contentPane.add(chckbxBasketball);
/*     */     
/* 176 */     JRadioButton chckbxTrackField = new JRadioButton("Track & Field");
/* 177 */     chckbxTrackField.setBounds(547, 72, 118, 23);
/* 178 */     this.contentPane.add(chckbxTrackField);
/*     */     
/* 180 */     JRadioButton chckbxTennis = new JRadioButton("Tennis");
/* 181 */     chckbxTennis.setBounds(665, 47, 106, 23);
/* 182 */     this.contentPane.add(chckbxTennis);
/*     */     
/* 184 */     JRadioButton chckbxSwimming = new JRadioButton("Swimming");
/* 185 */     chckbxSwimming.setBounds(665, 72, 118, 23);
/* 186 */     this.contentPane.add(chckbxSwimming);
/*     */     
/* 188 */     final ButtonGroup aGroup = new ButtonGroup();
/* 189 */     aGroup.add(chckbxBasketball);
/* 190 */     aGroup.add(chckbxTrackField);
/* 191 */     aGroup.add(chckbxTennis);
/* 192 */     aGroup.add(chckbxSwimming);
/*     */ 
/*     */     
/* 195 */     JRadioButton chckbxAmnesty = new JRadioButton("Amnesty");
/* 196 */     chckbxAmnesty.setBounds(805, 46, 106, 23);
/* 197 */     this.contentPane.add(chckbxAmnesty);
/*     */     
/* 199 */     JRadioButton chckbxGreenEco = new JRadioButton("GreenEco");
/* 200 */     chckbxGreenEco.setBounds(805, 72, 118, 23);
/* 201 */     this.contentPane.add(chckbxGreenEco);
/*     */     
/* 203 */     JRadioButton chckbxEduKids = new JRadioButton("EduKids");
/* 204 */     chckbxEduKids.setBounds(902, 46, 106, 23);
/* 205 */     this.contentPane.add(chckbxEduKids);
/*     */     
/* 207 */     JRadioButton chckbxAccesSports = new JRadioButton("AccesSports");
/* 208 */     chckbxAccesSports.setBounds(902, 72, 123, 23);
/* 209 */     this.contentPane.add(chckbxAccesSports);
/*     */     
/* 211 */     final ButtonGroup sGroup = new ButtonGroup();
/* 212 */     sGroup.add(chckbxAmnesty);
/* 213 */     sGroup.add(chckbxGreenEco);
/* 214 */     sGroup.add(chckbxEduKids);
/* 215 */     sGroup.add(chckbxAccesSports);
/*     */ 
/*     */     
/* 218 */     this.textField_1 = new JTextField();
/* 219 */     this.textField_1.setEditable(false);
/* 220 */     this.textField_1.setBounds(150, 210, 134, 26);
/* 221 */     this.contentPane.add(this.textField_1);
/* 222 */     this.textField_1.setColumns(10);
/*     */     
/* 224 */     this.textField_2 = new JTextField();
/* 225 */     this.textField_2.setEditable(false);
/* 226 */     this.textField_2.setColumns(10);
/* 227 */     this.textField_2.setBounds(150, 260, 134, 26);
/* 228 */     this.contentPane.add(this.textField_2);
/*     */     
/* 230 */     this.textField_3 = new JTextField();
/* 231 */     this.textField_3.setEditable(false);
/* 232 */     this.textField_3.setColumns(10);
/* 233 */     this.textField_3.setBounds(150, 310, 134, 26);
/* 234 */     this.contentPane.add(this.textField_3);
/*     */     
/* 236 */     this.textField_4 = new JTextField();
/* 237 */     this.textField_4.setEditable(false);
/* 238 */     this.textField_4.setColumns(10);
/* 239 */     this.textField_4.setBounds(150, 360, 134, 26);
/* 240 */     this.contentPane.add(this.textField_4);
/*     */     
/* 242 */     this.textField_5 = new JTextField();
/* 243 */     this.textField_5.setEditable(false);
/* 244 */     this.textField_5.setColumns(10);
/* 245 */     this.textField_5.setBounds(150, 410, 134, 26);
/* 246 */     this.contentPane.add(this.textField_5);
/*     */     
/* 248 */     this.textField_6 = new JTextField();
/* 249 */     this.textField_6.setEditable(false);
/* 250 */     this.textField_6.setColumns(10);
/* 251 */     this.textField_6.setBounds(150, 460, 134, 26);
/* 252 */     this.contentPane.add(this.textField_6);
/*     */     
/* 254 */     String[] levels = { "HL", "SL" };
/*     */     
/* 256 */     final JComboBox<String> comboBox_1 = new JComboBox<>(levels);
/* 257 */     comboBox_1.setBounds(80, 211, 70, 27);
/* 258 */     this.contentPane.add(comboBox_1);
/*     */     
/* 260 */     final JComboBox<String> comboBox_2 = new JComboBox<>(levels);
/* 261 */     comboBox_2.setBounds(80, 261, 70, 27);
/* 262 */     this.contentPane.add(comboBox_2);
/*     */     
/* 264 */     final JComboBox<String> comboBox_3 = new JComboBox<>(levels);
/* 265 */     comboBox_3.setBounds(80, 311, 70, 27);
/* 266 */     this.contentPane.add(comboBox_3);
/*     */     
/* 268 */     final JComboBox<String> comboBox_4 = new JComboBox<>(levels);
/* 269 */     comboBox_4.setBounds(80, 361, 70, 27);
/* 270 */     this.contentPane.add(comboBox_4);
/*     */     
/* 272 */     final JComboBox<String> comboBox_5 = new JComboBox<>(levels);
/* 273 */     comboBox_5.setBounds(80, 411, 70, 27);
/* 274 */     this.contentPane.add(comboBox_5);
/*     */     
/* 276 */     final JComboBox<String> comboBox_6 = new JComboBox<>(levels);
/* 277 */     comboBox_6.setBounds(80, 461, 70, 27);
/* 278 */     this.contentPane.add(comboBox_6);
/*     */ 
/*     */ 
/*     */     
/* 282 */     String[][] cellTable = new String[25][6];
/* 283 */     cellTable[0][0] = "English Literature";
/* 284 */     cellTable[1][0] = "English Language and Literature";
/*     */     
/* 286 */     cellTable[0][1] = "Spanish";
/* 287 */     cellTable[1][1] = "French";
/* 288 */     cellTable[2][1] = "Mandarin";
/* 289 */     cellTable[3][1] = "Spanish ab initio (SL only)";
/* 290 */     cellTable[4][1] = "French ab initio (SL only)";
/* 291 */     cellTable[5][1] = "Mandarin ab initio (SL only)";
/*     */     
/* 293 */     cellTable[0][2] = "Economics";
/* 294 */     cellTable[1][2] = "Business and Management";
/* 295 */     cellTable[2][2] = "Geography";
/* 296 */     cellTable[3][2] = "History";
/* 297 */     cellTable[4][2] = "Psychology";
/* 298 */     cellTable[5][2] = "Philosophy";
/*     */     
/* 300 */     cellTable[0][3] = "Physics";
/* 301 */     cellTable[1][3] = "Chemistry";
/* 302 */     cellTable[2][3] = "Biology";
/* 303 */     cellTable[3][3] = "Computer Science";
/* 304 */     cellTable[4][3] = "Design Technology";
/* 305 */     cellTable[5][3] = "ESS (SL only)";
/*     */     
/* 307 */     cellTable[0][4] = "Mathematical Studies (SL only)";
/* 308 */     cellTable[1][4] = "Mathematics";
/*     */ 
/*     */     
/* 311 */     cellTable[0][5] = "Music";
/* 312 */     cellTable[1][5] = "Dance";
/* 313 */     cellTable[2][5] = "Theater";
/* 314 */     cellTable[3][5] = "Film";
/* 315 */     cellTable[4][5] = "Visual Arts";
/*     */     
/* 317 */     cellTable[5][5] = "ITGS";
/* 318 */     cellTable[6][5] = "Further Mathematics (HL only)";
/*     */     
/* 320 */     cellTable[7][5] = "Physics";
/* 321 */     cellTable[8][5] = "Chemistry";
/* 322 */     cellTable[9][5] = "Biology";
/* 323 */     cellTable[10][5] = "Computer Science";
/* 324 */     cellTable[11][5] = "Design Technology";
/* 325 */     cellTable[12][5] = "ESS (SL only)";
/*     */     
/* 327 */     cellTable[13][5] = "Spanish";
/* 328 */     cellTable[14][5] = "French";
/* 329 */     cellTable[15][5] = "Mandarin";
/* 330 */     cellTable[16][5] = "Spanish ab initio (SL only)";
/* 331 */     cellTable[17][5] = "French ab initio (SL only)";
/* 332 */     cellTable[18][5] = "Mandarin ab initio (SL only)";
/*     */     
/* 334 */     cellTable[19][5] = "Economics";
/* 335 */     cellTable[20][5] = "Business and Management";
/* 336 */     cellTable[21][5] = "Geography";
/* 337 */     cellTable[22][5] = "History";
/* 338 */     cellTable[23][5] = "Psychology";
/* 339 */     cellTable[24][5] = "Philosophy";
/*     */ 
/*     */ 
/*     */     
/* 343 */     JButton btnNewButton = new JButton("☆ START MY IB JOURNEY ☆");
/* 344 */     btnNewButton.setBounds(21, 512, 251, 40);
/* 345 */     this.contentPane.add(btnNewButton);
/* 346 */     btnNewButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 348 */             if (rdbtnF.isSelected() || rdbtnM.isSelected()) {
/*     */               
/* 350 */               if (!Character_Creation.this.textField_first.getText().isEmpty() && !Character_Creation.this.textField_last.getText().isEmpty()) {
/*     */                 
/* 352 */                 if (Character_Creation.this.getSelectedButtonText(aGroup) != null && Character_Creation.this.getSelectedButtonText(sGroup) != null && Character_Creation.this.getSelectedButtonText(cGroup) != null) {
/*     */                   
/* 354 */                   if (!Character_Creation.this.textField_1.getText().isEmpty() || !Character_Creation.this.textField_2.getText().isEmpty() || !Character_Creation.this.textField_3.getText().isEmpty() || !Character_Creation.this.textField_4.getText().isEmpty() || 
/* 355 */                     !Character_Creation.this.textField_5.getText().isEmpty() || !Character_Creation.this.textField_6.getText().isEmpty()) {
/*     */                     
/* 357 */                     if (comboBox_1.getSelectedIndex() + comboBox_2.getSelectedIndex() + comboBox_3.getSelectedIndex() + comboBox_4.getSelectedIndex() + comboBox_5.getSelectedIndex() + comboBox_6.getSelectedIndex() == 3) {
/*     */                       
/* 359 */                       if (Character_Creation.this.textField_2.getText().contains("only") && 
/* 360 */                         comboBox_2.getSelectedIndex() == 0) {
/* 361 */                         Main.infoBox("ab initio subjects can only be in the standard level.", "Oops!");
/*     */                         
/*     */                         return;
/*     */                       } 
/*     */                       
/* 366 */                       if (Character_Creation.this.textField_4.getText().contains("only") && 
/* 367 */                         comboBox_4.getSelectedIndex() == 0) {
/* 368 */                         Main.infoBox("ESS can only be in the standard level.", "Oops!");
/*     */                         
/*     */                         return;
/*     */                       } 
/*     */                       
/* 373 */                       if (Character_Creation.this.textField_5.getText().contains("only") && 
/* 374 */                         comboBox_5.getSelectedIndex() == 0) {
/* 375 */                         Main.infoBox("Mathematical Studies can only be in the standard level.", "Oops!");
/*     */                         
/*     */                         return;
/*     */                       } 
/*     */                       
/* 380 */                       if (Character_Creation.this.textField_6.getText().contains("HL only")) {
/* 381 */                         if (comboBox_6.getSelectedIndex() == 1) {
/* 382 */                           Main.infoBox("Further Mathematics can only be in the higher level.", "Oops!");
/*     */                           return;
/*     */                         } 
/* 385 */                         if (comboBox_4.getSelectedIndex() != 0) {
/* 386 */                           Main.infoBox("Further Mathematics can only be taken if your group 4 subject is HL Mathematics.", "Oops!");
/*     */                           
/*     */                           return;
/*     */                         } 
/*     */                       } 
/* 391 */                       if (Character_Creation.this.textField_6.getText().contains("SL only") && 
/* 392 */                         comboBox_6.getSelectedIndex() == 0) {
/* 393 */                         Main.infoBox("ab initio subjects and ESS can only be in the standard level.", "Oops!");
/*     */                         
/*     */                         return;
/*     */                       } 
/* 397 */                       if (Character_Creation.this.textField_6.getText().equalsIgnoreCase(Character_Creation.this.textField_5.getText()) || Character_Creation.this.textField_6.getText().equalsIgnoreCase(Character_Creation.this.textField_4.getText()) || Character_Creation.this.textField_6.getText().equalsIgnoreCase(Character_Creation.this.textField_3.getText()) || 
/* 398 */                         Character_Creation.this.textField_6.getText().equalsIgnoreCase(Character_Creation.this.textField_2.getText()) || Character_Creation.this.textField_6.getText().equalsIgnoreCase(Character_Creation.this.textField_1.getText())) {
/* 399 */                         Main.infoBox("You cannot take the same subject twice.", "Oops!");
/*     */                         return;
/*     */                       } 
/* 402 */                       String t1 = Character_Creation.this.textField_1.getText();
/* 403 */                       String t2 = Character_Creation.this.textField_2.getText();
/* 404 */                       String t3 = Character_Creation.this.textField_3.getText();
/* 405 */                       String t4 = Character_Creation.this.textField_4.getText();
/* 406 */                       String t5 = Character_Creation.this.textField_5.getText();
/* 407 */                       String t6 = Character_Creation.this.textField_6.getText();
/*     */                       
/* 409 */                       if (Character_Creation.this.textField_1.getText().contains("(")) {
/* 410 */                         int n = Character_Creation.this.textField_1.getText().indexOf('(');
/* 411 */                         t1 = Character_Creation.this.textField_1.getText().substring(0, n - 1);
/*     */                       } 
/*     */                       
/* 414 */                       if (Character_Creation.this.textField_2.getText().contains("(")) {
/* 415 */                         int n = Character_Creation.this.textField_2.getText().indexOf('(');
/* 416 */                         t2 = Character_Creation.this.textField_2.getText().substring(0, n - 1);
/*     */                       } 
/*     */                       
/* 419 */                       if (Character_Creation.this.textField_3.getText().contains("(")) {
/* 420 */                         int n = Character_Creation.this.textField_3.getText().indexOf('(');
/* 421 */                         t3 = Character_Creation.this.textField_3.getText().substring(0, n - 1);
/*     */                       } 
/*     */                       
/* 424 */                       if (Character_Creation.this.textField_4.getText().contains("(")) {
/* 425 */                         int n = Character_Creation.this.textField_4.getText().indexOf('(');
/* 426 */                         t4 = Character_Creation.this.textField_4.getText().substring(0, n - 1);
/*     */                       } 
/*     */                       
/* 429 */                       if (Character_Creation.this.textField_5.getText().contains("(")) {
/* 430 */                         int n = Character_Creation.this.textField_5.getText().indexOf('(');
/* 431 */                         t5 = Character_Creation.this.textField_5.getText().substring(0, n - 1);
/*     */                       } 
/* 433 */                       if (Character_Creation.this.textField_6.getText().contains("(")) {
/* 434 */                         int n = Character_Creation.this.textField_6.getText().indexOf('(');
/* 435 */                         t6 = Character_Creation.this.textField_6.getText().substring(0, n - 1);
/*     */                       } 
/*     */                       
/* 438 */                       String[] g1_subject = { (String)comboBox_1.getSelectedItem(), t1 };
/* 439 */                       String[] g2_subject = { (String)comboBox_2.getSelectedItem(), t2 };
/* 440 */                       String[] g3_subject = { (String)comboBox_3.getSelectedItem(), t3 };
/* 441 */                       String[] g4_subject = { (String)comboBox_4.getSelectedItem(), t4 };
/* 442 */                       String[] g5_subject = { (String)comboBox_5.getSelectedItem(), t5 };
/* 443 */                       String[] g6_subject = { (String)comboBox_6.getSelectedItem(), t6 };
/*     */                       
/* 445 */                       String arts = Character_Creation.this.getSelectedButtonText(cGroup);
/* 446 */                       String service = Character_Creation.this.getSelectedButtonText(sGroup);
/* 447 */                       String sports = Character_Creation.this.getSelectedButtonText(aGroup);
/*     */                       
/* 449 */                       Main.p = new Player(Character_Creation.this.getSelectedButtonText(genderGroup), Character_Creation.this.textField_first.getText(), Character_Creation.this.textField_last.getText(), g1_subject, g2_subject, 
/* 450 */                           g3_subject, g4_subject, g5_subject, g6_subject, arts, service, sports);
/*     */                       
/* 452 */                       Main.p.setYear(1);
/* 453 */                       Main.p.setWeek(1);
/* 454 */                       Main.p.setWeekSchedule(new int[4]);
/* 455 */                       Main.p.setStress(0);
/* 456 */                       Main.p.setStressLimit(100);
/* 457 */                       Main.p.setSick(false);
/* 458 */                       Main.p.setSocial(0);
/* 459 */                       Main.p.setQoa(0);
/* 460 */                       Main.p.setIntelGain(10);
/* 461 */                       Main.p.setStressGain(8);
/* 462 */                       Main.p.setEffort(1);
/* 463 */                       Main.p.setG1_score(0);
/* 464 */                       Main.p.setG2_score(0);
/* 465 */                       Main.p.setG3_score(0);
/* 466 */                       Main.p.setG4_score(0);
/* 467 */                       Main.p.setG5_score(0);
/* 468 */                       Main.p.setG6_score(0);
/* 469 */                       Main.p.setArts_score(0);
/* 470 */                       Main.p.setArts_score(0);
/* 471 */                       Main.p.setTok(0);
/* 472 */                       Main.p.setEe(0);
/* 473 */                       Main.p.setMalpractice(false);
/* 474 */                       Main.p.setFinalIBScore(0);
/* 475 */                       Main.p.setUni("");
/* 476 */                       Main.p.setMajor("");
/*     */                       
/* 478 */                       Main.savePlayerToFile();
/*     */                       
/* 480 */                       Character_Creation.this.dispose();
/* 481 */                       Home h = new Home();
/* 482 */                       h.setVisible(true);
/*     */                     }
/*     */                     else {
/*     */                       
/* 486 */                       Main.infoBox("Please select three HLs and three SLs in total.", "Oops!");
/*     */                     } 
/*     */                   } else {
/*     */                     
/* 490 */                     Main.infoBox("Please select all of the required six courses.", "Oops!");
/*     */                   }
/*     */                 
/*     */                 } else {
/*     */                   
/* 495 */                   Main.infoBox("Please select your CAS focus areas.", "Oops!");
/*     */                 } 
/*     */               } else {
/*     */                 
/* 499 */                 Main.infoBox("Please enter your name.", "Oops!");
/*     */               } 
/*     */             } else {
/*     */               
/* 503 */               Main.infoBox("Please select a gender.", "Oops!");
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 508 */     final JTextPane textPane = new JTextPane();
/* 509 */     textPane.setEditable(false);
/* 510 */     textPane.setBounds(12, 130, 275, 34);
/* 511 */     this.contentPane.add(textPane);
/* 512 */     Border border = BorderFactory.createLineBorder(Color.BLACK);
/* 513 */     textPane.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/* 514 */     StyledDocument doc = textPane.getStyledDocument();
/* 515 */     SimpleAttributeSet center = new SimpleAttributeSet();
/* 516 */     StyleConstants.setAlignment(center, 1);
/* 517 */     doc.setParagraphAttributes(0, doc.getLength(), center, false);
/* 518 */     Border border2 = BorderFactory.createLineBorder(Color.BLACK);
/*     */     
/* 520 */     final JTable table = new JTable((Object[][])cellTable, (Object[])new String[] { "Group 1", "Group 2", "Group 3", "Group 4", "Group 5", "Group 6" });
/* 521 */     table.setBounds(300, 110, 725, 393);
/* 522 */     this.contentPane.add(table);
/* 523 */     table.setRowHeight(20);
/* 524 */     table.setDefaultEditor(Object.class, (TableCellEditor)null);
/* 525 */     table.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 528 */             int sRow = table.getSelectedRow();
/* 529 */             int sColumn = table.getSelectedColumn();
/* 530 */             String s = (String)table.getValueAt(sRow, sColumn);
/* 531 */             textPane.setText(s);
/*     */           }
/*     */         });
/* 534 */     table.setRowSelectionAllowed(false);
/* 535 */     table.setCellSelectionEnabled(true);
/*     */     
/* 537 */     JScrollPane scrollPane = new JScrollPane(table);
/* 538 */     scrollPane.setBounds(300, 110, 725, 393);
/* 539 */     this.contentPane.add(scrollPane);
/*     */     
/* 541 */     JButton btnSelect = new JButton("SELECT");
/* 542 */     btnSelect.setBounds(525, 522, 275, 40);
/* 543 */     this.contentPane.add(btnSelect);
/* 544 */     btnSelect.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 546 */             if (table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()) != null) {
/* 547 */               if (table.getSelectedColumn() == 0) {
/* 548 */                 Character_Creation.this.textField_1.setText((String)table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
/*     */               }
/* 550 */               else if (table.getSelectedColumn() == 1) {
/* 551 */                 Character_Creation.this.textField_2.setText((String)table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
/*     */               }
/* 553 */               else if (table.getSelectedColumn() == 2) {
/* 554 */                 Character_Creation.this.textField_3.setText((String)table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
/*     */               }
/* 556 */               else if (table.getSelectedColumn() == 3) {
/* 557 */                 Character_Creation.this.textField_4.setText((String)table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
/*     */               }
/* 559 */               else if (table.getSelectedColumn() == 4) {
/* 560 */                 Character_Creation.this.textField_5.setText((String)table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
/*     */               }
/* 562 */               else if (table.getSelectedColumn() == 5) {
/* 563 */                 Character_Creation.this.textField_6.setText((String)table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
/*     */               } 
/*     */             }
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 570 */     JLabel lblOnlyTwo = new JLabel("* only two character models (female and male) are available");
/* 571 */     lblOnlyTwo.setFont(new Font("Lucida Grande", 0, 9));
/* 572 */     lblOnlyTwo.setBounds(756, 504, 284, 16);
/* 573 */     this.contentPane.add(lblOnlyTwo);
/*     */     
/* 575 */     URL url = Main.class.getResource("/bg.jpg");
/* 576 */     JLabel lblBg = new JLabel("");
/* 577 */     lblBg.setHorizontalAlignment(0);
/* 578 */     lblBg.setBounds(0, 0, 1050, 600);
/* 579 */     this.contentPane.add(lblBg);
/* 580 */     lblBg.setIcon(new ImageIcon(url));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSelectedButtonText(ButtonGroup buttonGroup) {
/* 587 */     for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
/* 588 */       AbstractButton button = buttons.nextElement();
/*     */       
/* 590 */       if (button.isSelected()) {
/* 591 */         return button.getText();
/*     */       }
/*     */     } 
/*     */     
/* 595 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\82109\Downloads\survIB (v0.1.1).jar!\gui\Character_Creation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */