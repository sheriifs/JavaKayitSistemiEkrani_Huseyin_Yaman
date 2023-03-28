import javax.swing.*;
import java.awt.*;

public class besinci_ornek_huseyin_yaman{
    public static void main(String[] args) {
        // Pencereyi oluştur
        JFrame frame = new JFrame("Kayıt Sayfası");

        // Kullanıcı adı
        JLabel nameLabel = new JLabel("Adınız:");
        JTextField nameField = new JTextField(20);
        JPanel namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        // Çıkış butonu
        JButton exitButton = new JButton("x");
        exitButton.addActionListener(e -> System.exit(0)); // Uygulamayı kapatır
        JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Sağ üst köşede görünmesi için

            /*EXIT BUTONUM*/
       // exitPanel.add(exitButton);


        frame.add(exitPanel, BorderLayout.NORTH); // Pencerenin kuzey (yukarı) bölgesine ekle

        // Kayıt yaptırmak istediğiniz kurullar
        JLabel title = new JLabel("Kayıt yaptırmak istediğiniz kurullar:");
        JPanel titlePanel = new JPanel();
        titlePanel.add(title);

        // Dans ve yüzme seçenekleri
        JCheckBox danceCheckBox = new JCheckBox("Dans");
        JCheckBox languaCheckBox = new JCheckBox("İngilizce");
        JCheckBox sporCheckBox = new JCheckBox("Yüzme");
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.add(danceCheckBox);
        checkboxPanel.add(languaCheckBox);
        checkboxPanel.add(sporCheckBox);

        // Kaydet butonu
        JButton saveButton = new JButton("Kaydet");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        
        // Kaydet butonuna tıklanınca açılacak sayfa
        saveButton.addActionListener(e -> {
            String selectedOptions = "";
            if (danceCheckBox.isSelected()) {
                selectedOptions += " Dans,";
            }
            if (languaCheckBox.isSelected()) {
                selectedOptions += " İngilizce,";
            }
            if (sporCheckBox.isSelected()) {
                selectedOptions += " Yüzme,";
            }
            selectedOptions = selectedOptions.substring(0, selectedOptions.length() - 1); 
            JOptionPane.showMessageDialog(null, nameField.getText() + " kişisi " + selectedOptions + " Kursuna kayıt yaptırmak istiyor.");
        });

        // Pencereye bileşenleri ekle
        frame.add(namePanel);
        frame.add(titlePanel);
        frame.add(checkboxPanel);
        frame.add(buttonPanel);
        

        // Not bölümü
        JLabel noteLabel = new JLabel("Değerli Çiğdem hocamıza sunarım.");
        JPanel notePanel = new JPanel();
        notePanel.add(noteLabel);
        frame.add(notePanel, BorderLayout.SOUTH);

        // Pencereyi ayarla ve göster
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
