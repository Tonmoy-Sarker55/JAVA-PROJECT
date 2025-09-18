import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class UpazilaInfo extends JFrame implements ActionListener {

    private JLabel l1;
    private JTextField t1;
    private JButton HospitalBtn, ThanaBtn, FireServiceBtn, BloodDonorBtn;
    private JTextArea outputBound;
    private Map<String, Upazila> upazilas;

    public UpazilaInfo() {
        this.setTitle("LOCAL EMERGENCY SERVICE");
        this.setSize(1500, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#4375a4"));

        
        l1 = new JLabel("UPAZILA NAME");
        l1.setBounds(600, 20, 500, 40);
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        l1.setForeground(Color.BLACK);
        add(l1);

        
        t1 = new JTextField();
        t1.setBounds(600, 60, 180, 40);
        t1.setFont(new Font("Arial", Font.BOLD, 24));
        t1.setBackground(Color.WHITE);
        t1.setForeground(Color.decode("#000080"));
        t1.setHorizontalAlignment(JTextField.CENTER);
        add(t1);

        
        HospitalBtn = new JButton("HOSPITAL");
        HospitalBtn.setBounds(50, 110, 280, 70);
        HospitalBtn.setBackground(Color.WHITE);
        HospitalBtn.setForeground(Color.decode("#2E8B57"));
        HospitalBtn.setFont(new Font("Verdana", Font.BOLD, 20));
        HospitalBtn.addActionListener(this);
        add(HospitalBtn);

        ThanaBtn = new JButton("THANA");
        ThanaBtn.setBounds(400, 110, 280, 70);
        ThanaBtn.setBackground(Color.WHITE);
        ThanaBtn.setForeground(Color.decode("#2E8B57"));
        ThanaBtn.setFont(new Font("Verdana", Font.BOLD, 20));
        ThanaBtn.addActionListener(this);
        add(ThanaBtn);

        FireServiceBtn = new JButton("FIRESERVICE");
        FireServiceBtn.setBounds(750, 110, 280, 70);
        FireServiceBtn.setBackground(Color.WHITE);
        FireServiceBtn.setForeground(Color.decode("#2E8B57"));
        FireServiceBtn.setFont(new Font("Verdana", Font.BOLD, 20));
        FireServiceBtn.addActionListener(this);
        add(FireServiceBtn);

        BloodDonorBtn = new JButton("BLOOD DONOR");
        BloodDonorBtn.setBounds(1110, 110, 280, 70);
        BloodDonorBtn.setBackground(Color.WHITE);
        BloodDonorBtn.setForeground(Color.decode("#2E8B57"));
        BloodDonorBtn.setFont(new Font("Verdana", Font.BOLD, 20));
        BloodDonorBtn.addActionListener(this);
        add(BloodDonorBtn);

        
        outputBound = new JTextArea();
        outputBound.setEditable(false);
        outputBound.setFont(new Font("Serif", Font.BOLD, 36));
        outputBound.setBackground(Color.decode("#F5F5DC"));
        JScrollPane scroll = new JScrollPane(outputBound);
        scroll.setBounds(50, 200, 1340, 600);
        add(scroll);

        
        upazilas = new HashMap<>();
        loadUpazilas();
    }

    private void loadUpazilas() {
        Upazila u1 = new Upazila("DHAKA SADAR");
        u1.addHospital(new Hospital("Dhaka Medical", "Shahbagh", "01711111111"));
        u1.addHospital(new Hospital("BSMMU", "Dhanmondi", "01722222222"));
        u1.setThana(new Thana("Shahbagh Thana", "Shahbagh", "01733333333"));
        u1.setFireService(new FireService("Central Fire Service", "Mirpur Road", "01744444444"));
        u1.addDonor(new BloodDonor("Rahim", "A+", "01755555555"));
        u1.addDonor(new BloodDonor("Karim", "O-", "01766666666"));
        upazilas.put(u1.getName().toUpperCase(), u1);

        Upazila u2 = new Upazila("GAZIPUR");
        u2.addHospital(new Hospital("Gazipur Hospital", "Chowrasta", "01811111111"));
        u2.addHospital(new Hospital("Tongi General", "Tongi", "01822222222"));
        u2.setThana(new Thana("Gazipur Thana", "Chowrasta", "01833333333"));
        u2.setFireService(new FireService("Gazipur Fire Service", "Tongi Road", "01844444444"));
        u2.addDonor(new BloodDonor("Hasan", "B+", "01855555555"));
        u2.addDonor(new BloodDonor("Mamun", "AB-", "01866666666"));
        upazilas.put(u2.getName().toUpperCase(), u2);

        Upazila u3 = new Upazila("SAVAR");
        u3.addHospital(new Hospital("Savar Upazila Health Complex", "Savar", "01711111111"));
        u3.addHospital(new Hospital("Enam Medical College & Hospital", "Savar", "01722222222"));
        u3.setThana(new Thana("Savar Thana", "Savar Bazar Road", "01733333333"));
        u3.setFireService(new FireService("Savar Fire Service", "Savar Bus Stand", "01744444444"));
        u3.addDonor(new BloodDonor("Rashid", "O+", "01755555555"));
        u3.addDonor(new BloodDonor("Kamal", "A-", "01766666666"));
        upazilas.put(u3.getName().toUpperCase(), u3);

  
        Upazila u4 = new Upazila("DHAMRAI");
        u4.addHospital(new Hospital("Dhamrai Upazila Health Complex", "Dhamrai Bazar", "01911111111"));
        u4.addHospital(new Hospital("Popular Medical Center", "Kalampur, Dhamrai", "01922222222"));
        u4.setThana(new Thana("Dhamrai Thana", "Dhamrai Sadar Road", "01933333333"));
        u4.setFireService(new FireService("Dhamrai Fire Service", "Kalampur, Dhamrai", "01944444444"));
        u4.addDonor(new BloodDonor("Rahim", "O+", "01955555555"));
        u4.addDonor(new BloodDonor("Fatema", "A-", "01966666666"));
        upazilas.put(u4.getName().toUpperCase(), u4);


        Upazila u5 = new Upazila("KERANIGANJ");
        u5.addHospital(new Hospital("Keraniganj Upazila Health Complex", "Keraniganj Sadar", "01611111111"));
        u5.addHospital(new Hospital("South Keraniganj General Hospital", "Hasnabad, Keraniganj", "01622222222"));
        u5.setThana(new Thana("Keraniganj Thana", "Keraniganj Bazar Road", "01633333333"));
        u5.setFireService(new FireService("Keraniganj Fire Service", "Amin Bazar Road, Keraniganj", "01644444444"));
        u5.addDonor(new BloodDonor("Karim", "B-", "01655555555"));
        u5.addDonor(new BloodDonor("Salma", "AB+", "01666666666"));
        upazilas.put(u5.getName().toUpperCase(), u5);

        Upazila u6 = new Upazila("NAWABGANJ");
        u6.addHospital(new Hospital("Nawabganj Upazila Health Complex", "Nawabganj Sadar", "01511111111"));
        u6.addHospital(new Hospital("Nawabganj Model Hospital", "Daudpur, Nawabganj", "01522222222"));
        u6.setThana(new Thana("Nawabganj Thana", "Nawabganj Bazar Road", "01533333333"));
        u6.setFireService(new FireService("Nawabganj Fire Service", "Thana Road, Nawabganj", "01544444444"));
        u6.addDonor(new BloodDonor("Jamal", "O-", "01555555555"));
        u6.addDonor(new BloodDonor("Rima", "A+", "01566666666"));
        upazilas.put(u6.getName().toUpperCase(), u6);

        Upazila u7 = new Upazila("DOHAR");
        u7.addHospital(new Hospital("Dohar Upazila Health Complex", "Dohar Sadar", "01411111111"));
        u7.addHospital(new Hospital("Dohar General Hospital", "Joypara, Dohar", "01422222222"));
        u7.setThana(new Thana("Dohar Thana", "Joypara Bazar Road", "01433333333"));
        u7.setFireService(new FireService("Dohar Fire Service", "Joypara, Dohar", "01444444444"));
        u7.addDonor(new BloodDonor("Nasir", "B+", "01455555555"));
        u7.addDonor(new BloodDonor("Sharmin", "O-", "01466666666"));
        upazilas.put(u7.getName().toUpperCase(), u7);
   


    }

    private Upazila getSelectedUpazila() {
        String name = t1.getText().trim().toUpperCase();
        return upazilas.get(name);
    }

    private void showHospitals() {
        Upazila u = getSelectedUpazila();
        if (u == null) { outputBound.setText("Upazila not found!"); return; }
        outputBound.setText("HOSPITALS IN " + u.getName() + ":\n\n");
        for (Hospital h : u.getHospitals()) outputBound.append(h.getInfo() + "\n\n");
    }

    private void showThana() {
        Upazila u = getSelectedUpazila();
        if (u == null) { outputBound.setText("Upazila not found!"); return; }
        outputBound.setText("THANA OF " + u.getName() + ":\n\n");
        outputBound.append(u.getThana().getInfo() + "\n");
    }

    private void showFireService() {
        Upazila u = getSelectedUpazila();
        if (u == null) { outputBound.setText("Upazila not found!"); return; }
        outputBound.setText("FIRESERVICE OF " + u.getName() + ":\n\n");
        outputBound.append(u.getFireService().getInfo() + "\n");
    }

    private void showDonors() {
        Upazila u = getSelectedUpazila();
        if (u == null) { outputBound.setText("Upazila not found!"); return; }
        outputBound.setText("BLOOD DONORS IN " + u.getName() + ":\n\n");
        for (BloodDonor d : u.getDonors()) outputBound.append(d.getInfo() + "\n");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == HospitalBtn) showHospitals();
        else if (e.getSource() == ThanaBtn) showThana();
        else if (e.getSource() == FireServiceBtn) showFireService();
        else if (e.getSource() == BloodDonorBtn) showDonors();
    }

   
}


