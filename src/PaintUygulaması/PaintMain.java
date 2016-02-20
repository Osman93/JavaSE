/**
 * @author Osman Aşar
 */
package PaintUygulaması;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.text.DecimalFormat;
@SuppressWarnings("Seial")
public class PaintMain extends JFrame {
    
    JButton bFirça,bCizgi,bElips,bDik,bDolgu,bKenar;
    
    int hareket=1;
    
   // JSlider saydamlık;
    
   // JLabel saydamlıkLabel;
    
   // DecimalFormat decimal=new DecimalFormat("#.#");//burda ondalıklı sayıyı tek haneli göstermek için kulandım..
    
    Graphics2D grafikAyarları;
    
    float saydamlıkDeğeri=1.0f;
    
    Color kenarlik=Color.BLACK,dolgu=Color.BLACK;
    public static void main(String[] args) {
        new PaintMain();//Constructor çağırdık...
        
    }
    public PaintMain(){
    
        this.setBounds(100, 100, 1000, 600);//Framimizin boyutunu ayarladık..
        
        this.setTitle("Java Paint Uygulamam");//Framemimize başlık ekledik..
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Çıkış düğmesine bastığımızda uygulamanın kapanacağını söyledik..
        
        JPanel bPanel=new JPanel();//Butonları eklemek için jpanel oluşturduk...
        JPanel menu=new JPanel();
        
        Box kutu=Box.createHorizontalBox();//yatay bir kutu tanımladık..
        
        JMenuBar menuBar = new JMenuBar();
		
                
		menuBar.setBounds(0, 0, 444, 21);
		menu.add(menuBar);

		JMenu Yardım = new JMenu("Yardım");
		menuBar.add(Yardım);

		JMenuItem hakkında = new JMenuItem("Hakkında");
		Yardım.add(hakkında);
        hakkında.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
	Hakkında h=new Hakkında();
	h.setVisible(true);}});
        
       this.add(menu,BorderLayout.NORTH);
       
      
     //butonları burada özelleştireceğiz...

        bFirça=ButonYap(".\\src\\PaintUygulaması\\f.png",1);
        
        bCizgi=ButonYap(".\\src\\PaintUygulaması\\ç.png",2);
        
        bElips=ButonYap(".\\src\\PaintUygulaması\\e.png",3);
        
        bDik=ButonYap(".\\src\\PaintUygulaması\\d.png",4);
        
        bDolgu=renkliButonYap(".\\src\\PaintUygulaması\\dolgu.png",6,false);
        
        bKenar=renkliButonYap(".\\src\\PaintUygulaması\\k.png",5,true);
      //Butonlarımızı kutuya ekledik...  
        kutu.add(bFirça);
        kutu.add(bCizgi);
        kutu.add(bElips);
        kutu.add(bDik);
        kutu.add(bKenar);
        kutu.add(bDolgu);
        
     //   saydamlıkLabel=new JLabel("Saydamlık=1");
       // saydamlık=new JSlider(1,99,99);
       // SliderTıklandığında sliderL=new SliderTıklandığında();
        
        //saydamlık.addChangeListener(sliderL);
        
        //kutu.add(saydamlıkLabel);
        //kutu.add(saydamlık);
        
        
        
      //panelimize Box nesnesini ekledik...
        bPanel.add(kutu);
    //Frame mimize panelimizi ekleyelim
        this.add(bPanel,BorderLayout.SOUTH);
    //ÇizimTablosu sınıfımızı ekliyoruz framimizin ortasına..    
        this.add(new CizimTablosu(),BorderLayout.CENTER);
        
    this.setVisible(true);
    
    }
    //Buton özelleştirmem metodumuz
    public JButton ButonYap(String icon,final int sıra){
    JButton button=new JButton();//Buton tanımı yaptık
    ImageIcon bIcon=new ImageIcon(icon);//Resim ekleme metodu nesnesi ekledik..
    button.setIcon(bIcon);//Butonumuzun iconunu bu şekilde değiştirdik...
    
    button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          hareket=sıra;
          
    }
    });//ActionListener sonu
    
    
      return button;   
}
            
    public JButton renkliButonYap(String icon, final int sıra,final boolean kenarlıkRengi) {
        JButton button=new JButton();//Buton tanımı yaptık
    ImageIcon bIcon=new ImageIcon(icon);//Resim ekleme metodu nesnesi ekledik..
    button.setIcon(bIcon);//Butonumuzun iconunu bu şekilde değiştirdik...
    
    button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
         if(kenarlıkRengi){
         kenarlik=JColorChooser.showDialog(null, "Kenarlık rengi seç", Color.BLACK);
         
         }
         else{
         dolgu=JColorChooser.showDialog(null, "Dolgu rengi seç", Color.BLACK);
             }
          
             }}
);
    
    //ActionListener sonu
            return button; 
    }//renkli buton sonu

   /* private  class SliderTıklandığında implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            if(e.getSource()==saydamlık){
            
            saydamlıkLabel.setText("Saydamlık"+decimal.format(saydamlık.getValue()*.1));
            saydamlıkDeğeri=(float)(saydamlık.getValue()*.1);
            }
        }

     
    }*/

    private  class CizimTablosu extends JComponent{
//Arraylist obje ve nesneleri içinde bir dizi misali tutar
        ArrayList<Shape> şekil=new ArrayList<Shape>();
        ArrayList<Color> dolguŞekli=new ArrayList<Color>();
         ArrayList<Color> kenarlıkŞekli=new ArrayList<Color>();
         ArrayList<Float> saydamlıkYüzdesi=new ArrayList<Float>();
         
         Point başlangıç,son;
         public CizimTablosu(){
         this.addMouseListener(new MouseAdapter() {

         public void mousePressed(MouseEvent e){
             //Fareye basıldığında ne yapacak..
             if(hareket!=1){
         başlangıç=new Point(e.getX(), e.getY());
         son=başlangıç;
         repaint();
             }
         }
         public void mouseReleased(MouseEvent e){//Fareyi bıraktığımızda ne yapacak onu belirler...
             
              if(hareket!=1){
                  Shape şekil1=null;
                  switch(hareket){
                      case 2:
                          şekil1=çizgiCiz(başlangıç.x,e.getX(),başlangıç.y,e.getY());
                          break;
                          
                      case 3:
                          şekil1=ovalCiz(başlangıç.x,e.getX(),başlangıç.y,e.getY());
                          break;
                          
                          
                      case 4:
                          şekil1=dörtgenCiz(başlangıç.x,e.getX(),başlangıç.y,e.getY());
                          
                          break;
          
        
                  }
                   şekil.add(şekil1);
         dolguŞekli.add(dolgu);
         kenarlıkŞekli.add(kenarlik);
         
        // saydamlıkYüzdesi.add(saydamlıkDeğeri);
         başlangıç=null;
         son=null;
         repaint();//Ekranı temizler
              }
         }
         
         
         });//MouseListener sonu....
         
         this.addMouseMotionListener(new MouseMotionAdapter() {

             @Override
             public void mouseDragged(MouseEvent e) {
                 if(hareket==1){
                 int x=e.getX();
                 int y=e.getY();
                 
                 Shape şekil1=null;
                 
                 kenarlik=dolgu;
                 
                 şekil1=firçaCiz(x,y,5,5);
                 
                 şekil.add(şekil1);
                 
                 dolguŞekli.add(dolgu);
                 kenarlıkŞekli.add(kenarlik);
                 saydamlıkYüzdesi.add(saydamlıkDeğeri);
                 }
                 son=new Point(e.getX(),e.getY());
      
                 repaint();
             }

             
         });
         
        
         
         }
        public void paint(Graphics g){
        
         grafikAyarları=(Graphics2D)g;
        grafikAyarları.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        grafikAyarları.setStroke(new BasicStroke(4));
        
            Iterator<Color> kenarlıkSay=kenarlıkŞekli.iterator();
           Iterator<Color> dolguSay=dolguŞekli.iterator();
          // Iterator<Float> saydamlıkSay=saydamlıkYüzdesi.iterator();
              
           
           
           for(Shape s:şekil){
             grafikAyarları.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1.0f));
               
           grafikAyarları.setPaint(kenarlıkSay.next());
           grafikAyarları.draw(s);
           grafikAyarları.setPaint(dolguSay.next());
           grafikAyarları.fill(s);
           
           
           }
           if(başlangıç!=null && son!=null){
            grafikAyarları.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.40f));
            grafikAyarları.setPaint(Color.LIGHT_GRAY);
            
            Shape şekil1=null;
            switch(hareket){
                      case 2:
                          şekil1=çizgiCiz(başlangıç.x,son.x,başlangıç.y,son.y);
                          break;
                          
                      case 3:
                          şekil1=ovalCiz(başlangıç.x,son.x,başlangıç.y,son.y);
                          break;
                          
                          
                      case 4:
                          şekil1=dörtgenCiz(başlangıç.x,son.x,başlangıç.y,son.y);
                          
                          break;
          
            
           
           
           }
            grafikAyarları.draw(şekil1);
        
        }
       
    }//çizimTablosu sonu...
    
    private Rectangle2D.Float dörtgenCiz(int x1,int x2,int y1,int y2){//Dörtgenimizi çizmesini söylüyoruz burda...
    int x=Math.min(x1, x2);
    int y=Math.min(y1, y2);
    
    int genişlik=Math.abs(x1-x2);
    int yükseklik=Math.abs(y1-y2);
    
    return new Rectangle2D.Float(x, y, genişlik, yükseklik);
    
    }
    private Ellipse2D.Float ovalCiz(int x1,int x2,int y1,int y2){//Dörtgenimizi çizmesini söylüyoruz burda...
    int x=Math.min(x1, x2);
    int y=Math.min(y1, y2);
    
    int genişlik=Math.abs(x1-x2);
    int yükseklik=Math.abs(y1-y2);
    
    return new Ellipse2D.Float(x, y, genişlik, yükseklik);
    
    }
    private Line2D.Float çizgiCiz(int x1,int x2,int y1,int y2){
        
        return new Line2D.Float(x1,y1,x2,y2);

    }
    private Ellipse2D.Float firçaCiz(int x1,int y1,int Fgenişlik,int Fyükseklik){
    
    
    return new Ellipse2D.Float(x1,y1,Fgenişlik,Fyükseklik);
    
    }
    }
    
}