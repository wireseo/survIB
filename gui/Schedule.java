/*     */ package gui;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.net.URL;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.JTextPane;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import javax.swing.table.TableCellEditor;
/*     */ import javax.swing.text.SimpleAttributeSet;
/*     */ import javax.swing.text.StyleConstants;
/*     */ import javax.swing.text.StyledDocument;
/*     */ 
/*     */ 
/*     */ public class Schedule
/*     */   extends JFrame
/*     */ {
/*     */   private JPanel contentPane;
/*  30 */   static String[][] cellTable = new String[11][4];
/*     */   
/*     */   private JTextField textField_school;
/*     */   
/*     */   private JTextField textField_afternoon;
/*     */   
/*     */   private JTextField textField_night;
/*     */   private JTextField textField_weekend;
/*     */   
/*     */   public Schedule() {
/*  40 */     setDefaultCloseOperation(3);
/*  41 */     setBounds(100, 100, 900, 470);
/*  42 */     this.contentPane = new JPanel();
/*  43 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  44 */     setContentPane(this.contentPane);
/*  45 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  47 */     int[] w = new int[4];
/*  48 */     w[0] = -1; w[1] = -1; w[2] = -1; w[3] = -1;
/*  49 */     Main.p.setWeekSchedule(w);
/*     */     
/*  51 */     cellTable[0][0] = "Study " + Main.p.getG1_subject()[0] + " " + Main.p.getG1_subject()[1];
/*  52 */     cellTable[1][0] = "Study " + Main.p.getG2_subject()[0] + " " + Main.p.getG2_subject()[1];
/*  53 */     cellTable[2][0] = "Study " + Main.p.getG3_subject()[0] + " " + Main.p.getG3_subject()[1];
/*  54 */     cellTable[3][0] = "Study " + Main.p.getG4_subject()[0] + " " + Main.p.getG4_subject()[1];
/*  55 */     cellTable[4][0] = "Study " + Main.p.getG5_subject()[0] + " " + Main.p.getG5_subject()[1];
/*  56 */     cellTable[5][0] = "Study " + Main.p.getG6_subject()[0] + " " + Main.p.getG6_subject()[1];
/*  57 */     cellTable[6][0] = "Socialize";
/*  58 */     cellTable[7][0] = "Stay Home";
/*  59 */     cellTable[8][0] = "TOK";
/*     */     
/*  61 */     cellTable[0][1] = "Study " + Main.p.getG1_subject()[0] + " " + Main.p.getG1_subject()[1];
/*  62 */     cellTable[1][1] = "Study " + Main.p.getG2_subject()[0] + " " + Main.p.getG2_subject()[1];
/*  63 */     cellTable[2][1] = "Study " + Main.p.getG3_subject()[0] + " " + Main.p.getG3_subject()[1];
/*  64 */     cellTable[3][1] = "Study " + Main.p.getG4_subject()[0] + " " + Main.p.getG4_subject()[1];
/*  65 */     cellTable[4][1] = "Study " + Main.p.getG5_subject()[0] + " " + Main.p.getG5_subject()[1];
/*  66 */     cellTable[5][1] = "Study " + Main.p.getG6_subject()[0] + " " + Main.p.getG6_subject()[1];
/*  67 */     cellTable[6][1] = "CAS: " + Main.p.getArts();
/*  68 */     cellTable[7][1] = "CAS: " + Main.p.getSports();
/*  69 */     cellTable[8][1] = "CAS: " + Main.p.getService();
/*  70 */     cellTable[9][1] = "Socialize";
/*  71 */     cellTable[10][1] = "Relax";
/*     */     
/*  73 */     cellTable[0][2] = "Study " + Main.p.getG1_subject()[0] + " " + Main.p.getG1_subject()[1];
/*  74 */     cellTable[1][2] = "Study " + Main.p.getG2_subject()[0] + " " + Main.p.getG2_subject()[1];
/*  75 */     cellTable[2][2] = "Study " + Main.p.getG3_subject()[0] + " " + Main.p.getG3_subject()[1];
/*  76 */     cellTable[3][2] = "Study " + Main.p.getG4_subject()[0] + " " + Main.p.getG4_subject()[1];
/*  77 */     cellTable[4][2] = "Study " + Main.p.getG5_subject()[0] + " " + Main.p.getG5_subject()[1];
/*  78 */     cellTable[5][2] = "Study " + Main.p.getG6_subject()[0] + " " + Main.p.getG6_subject()[1];
/*  79 */     cellTable[6][2] = "Socialize";
/*  80 */     cellTable[7][2] = "Sleep Early";
/*     */     
/*  82 */     cellTable[0][3] = "CAS: " + Main.p.getArts();
/*  83 */     cellTable[1][3] = "CAS: " + Main.p.getSports();
/*  84 */     cellTable[2][3] = "CAS: " + Main.p.getService();
/*  85 */     cellTable[3][3] = "Work on Personal Project";
/*  86 */     cellTable[4][3] = "Socialize";
/*  87 */     cellTable[5][3] = "Relax";
/*  88 */     cellTable[6][3] = "EE";
/*     */ 
/*     */     
/*  91 */     final JTextPane textPane_1 = new JTextPane();
/*  92 */     textPane_1.setBounds(700, 23, 182, 50);
/*  93 */     this.contentPane.add(textPane_1);
/*  94 */     StyledDocument doc = textPane_1.getStyledDocument();
/*  95 */     SimpleAttributeSet center = new SimpleAttributeSet();
/*  96 */     StyleConstants.setAlignment(center, 1);
/*  97 */     doc.setParagraphAttributes(0, doc.getLength(), center, false);
/*     */     
/*  99 */     final JTable table = new JTable((Object[][])cellTable, (Object[])new String[] { "SCHOOL", "EVENING", "NIGHT", "WEEKEND" });
/* 100 */     table.setBounds(10, 10, 335, 393);
/* 101 */     table.setRowHeight(30);
/* 102 */     table.setDefaultEditor(Object.class, (TableCellEditor)null);
/* 103 */     table.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 106 */             int sRow = table.getSelectedRow();
/* 107 */             int sColumn = table.getSelectedColumn();
/* 108 */             String s = (String)table.getValueAt(sRow, sColumn);
/* 109 */             textPane_1.setText(s);
/*     */           }
/*     */         });
/* 112 */     table.setRowSelectionAllowed(false);
/* 113 */     table.setCellSelectionEnabled(true);
/*     */     
/* 115 */     JScrollPane scrollPane = new JScrollPane(table);
/* 116 */     scrollPane.setBounds(20, 20, 659, 354);
/* 117 */     this.contentPane.add(scrollPane);
/*     */ 
/*     */     
/* 120 */     JButton btnSelect = new JButton("SELECT");
/* 121 */     btnSelect.setBounds(210, 393, 275, 40);
/* 122 */     this.contentPane.add(btnSelect);
/* 123 */     btnSelect.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 126 */             int sRow = table.getSelectedRow();
/* 127 */             int sColumn = table.getSelectedColumn();
/* 128 */             String s = (String)table.getValueAt(sRow, sColumn);
/* 129 */             int[] w = Main.p.getWeekSchedule();
/* 130 */             if (sColumn == 0) {
/* 131 */               w[0] = sRow;
/* 132 */               Main.p.setWeekSchedule(w);
/* 133 */               if (w[0] != -1 && 
/* 134 */                 !Schedule.cellTable[w[0]][0].equalsIgnoreCase("")) Schedule.this.textField_school.setText(Schedule.cellTable[w[0]][0]);
/*     */             
/*     */             }
/* 137 */             else if (sColumn == 1) {
/* 138 */               w[1] = sRow;
/* 139 */               Main.p.setWeekSchedule(w);
/* 140 */               if (w[1] != -1 && 
/* 141 */                 !Schedule.cellTable[w[1]][1].equalsIgnoreCase("")) Schedule.this.textField_afternoon.setText(Schedule.cellTable[w[1]][1]);
/*     */             
/*     */             }
/* 144 */             else if (sColumn == 2) {
/* 145 */               w[2] = sRow;
/* 146 */               Main.p.setWeekSchedule(w);
/* 147 */               if (w[2] != -1 && 
/* 148 */                 !Schedule.cellTable[w[2]][2].equalsIgnoreCase("")) Schedule.this.textField_night.setText(Schedule.cellTable[w[2]][2]);
/*     */             
/*     */             }
/* 151 */             else if (sColumn == 3) {
/* 152 */               w[3] = sRow;
/* 153 */               Main.p.setWeekSchedule(w);
/* 154 */               if (w[3] != -1 && 
/* 155 */                 !Schedule.cellTable[w[3]][3].equalsIgnoreCase("")) Schedule.this.textField_weekend.setText(Schedule.cellTable[w[3]][3]);
/*     */             
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 162 */     JButton btnContin = new JButton("Continue w/ Schedule");
/* 163 */     btnContin.setFont(new Font("Lucida Grande", 0, 12));
/* 164 */     btnContin.setBounds(700, 371, 182, 62);
/* 165 */     this.contentPane.add(btnContin);
/* 166 */     btnContin.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 169 */             for (int i = 0; i < 4; i++) {
/* 170 */               if (Main.p.getWeekSchedule()[i] == -1) {
/* 171 */                 Main.infoBox("Please select all necessary courses.", "");
/*     */                 return;
/*     */               } 
/*     */             } 
/* 175 */             if (Main.p.getWeekSchedule()[0] == 10 || Main.p.getWeekSchedule()[0] == 11 || Main.p.getWeekSchedule()[2] == 9 || 
/* 176 */               Main.p.getWeekSchedule()[2] == 10 || Main.p.getWeekSchedule()[2] == 11 || Main.p.getWeekSchedule()[3] == 8 || 
/* 177 */               Main.p.getWeekSchedule()[3] == 10 || Main.p.getWeekSchedule()[3] == 11) {
/* 178 */               Main.infoBox("Please select all necessary courses.", "");
/*     */             } else {
/*     */               
/* 181 */               Schedule.this.dispose();
/* 182 */               Schedule_Event se = new Schedule_Event();
/* 183 */               se.setVisible(true);
/*     */             } 
/*     */           }
/*     */         });
/* 187 */     JButton btnBack = new JButton("← Back");
/* 188 */     btnBack.setBounds(20, 393, 84, 40);
/* 189 */     this.contentPane.add(btnBack);
/* 190 */     btnBack.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 192 */             Schedule.this.dispose();
/* 193 */             Home h = new Home();
/* 194 */             h.setVisible(true);
/*     */           }
/*     */         });
/*     */     
/* 198 */     JLabel lblSchool = new JLabel(":: SCHOOL ::");
/* 199 */     lblSchool.setHorizontalAlignment(0);
/* 200 */     lblSchool.setBounds(700, 108, 182, 16);
/* 201 */     this.contentPane.add(lblSchool);
/*     */     
/* 203 */     JLabel lblAfternoon = new JLabel(":: AFTERNOON ::");
/* 204 */     lblAfternoon.setHorizontalAlignment(0);
/* 205 */     lblAfternoon.setBounds(700, 168, 182, 16);
/* 206 */     this.contentPane.add(lblAfternoon);
/*     */     
/* 208 */     JLabel lblNight = new JLabel(":: NIGHT ::");
/* 209 */     lblNight.setHorizontalAlignment(0);
/* 210 */     lblNight.setBounds(700, 228, 182, 16);
/* 211 */     this.contentPane.add(lblNight);
/*     */     
/* 213 */     JLabel lblWeekend = new JLabel(":: WEEKEND ::");
/* 214 */     lblWeekend.setHorizontalAlignment(0);
/* 215 */     lblWeekend.setBounds(700, 288, 182, 16);
/* 216 */     this.contentPane.add(lblWeekend);
/*     */     
/* 218 */     this.textField_school = new JTextField();
/* 219 */     this.textField_school.setHorizontalAlignment(0);
/* 220 */     this.textField_school.setEditable(false);
/* 221 */     this.textField_school.setBounds(700, 128, 182, 26);
/* 222 */     this.contentPane.add(this.textField_school);
/* 223 */     this.textField_school.setColumns(10);
/*     */     
/* 225 */     this.textField_afternoon = new JTextField();
/* 226 */     this.textField_afternoon.setEditable(false);
/* 227 */     this.textField_afternoon.setHorizontalAlignment(0);
/* 228 */     this.textField_afternoon.setColumns(10);
/* 229 */     this.textField_afternoon.setBounds(700, 188, 182, 26);
/* 230 */     this.contentPane.add(this.textField_afternoon);
/*     */     
/* 232 */     this.textField_night = new JTextField();
/* 233 */     this.textField_night.setEditable(false);
/* 234 */     this.textField_night.setHorizontalAlignment(0);
/* 235 */     this.textField_night.setColumns(10);
/* 236 */     this.textField_night.setBounds(700, 248, 182, 26);
/* 237 */     this.contentPane.add(this.textField_night);
/*     */     
/* 239 */     this.textField_weekend = new JTextField();
/* 240 */     this.textField_weekend.setHorizontalAlignment(0);
/* 241 */     this.textField_weekend.setEditable(false);
/* 242 */     this.textField_weekend.setColumns(10);
/* 243 */     this.textField_weekend.setBounds(700, 308, 182, 26);
/* 244 */     this.contentPane.add(this.textField_weekend);
/*     */     
/* 246 */     URL url = Main.class.getResource("/bg.jpg");
/* 247 */     JLabel lblBg = new JLabel("");
/* 248 */     lblBg.setHorizontalAlignment(0);
/* 249 */     lblBg.setBounds(0, 0, 1050, 600);
/* 250 */     this.contentPane.add(lblBg);
/* 251 */     lblBg.setIcon(new ImageIcon(url));
/*     */   }
/*     */ }


/* Location:              C:\Users\82109\Downloads\survIB (v0.1.1).jar!\gui\Schedule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */