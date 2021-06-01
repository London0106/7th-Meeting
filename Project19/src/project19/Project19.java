/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project19;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project19 {
//    question = Si andrew adalah seorang pengusaha toko elektrik . 
//    Dia menjual barang-barang seperti hp, terminal dan tv  .
//harga hp persatuan 1.500.000 , terminal 200.000 rp dan TV itu 5.000.000 .
//Karena penjualan-nya makin banyak andrew kemudian memutuskan untuk
//menggunakan aplikasi sehingga memudahkan penjualan. Fitur-fitur yang ingin dibuat adalah
//1.Menambah stok barang ,
//2.Menjual barang ,
//3.diskon yang diberikan sebanyak jumlah huruf vokal nama pembeli (maximal 5) * 10 %.
//4. Andrew juga perlu membuat mengetahui nama dan alamat dari pembeli yang membeli barang dari tokonya.
//5.Andrew juga ingin membuat sebuah hal unik dengan tokonya jika
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    int i = 1;
    int totalHarga;
    int sellMobile = 0;
    int sellTerminal = 0;
    int stockMobile = 0;
    int stockTerminal = 0;
    int stockTv = 0;
    int totalVocalname = 0;
    int j;
    int k;
    int mobilePhone;
    int terminal;
    int tv;
    String yourName;
        do {
           System.out.println("Andrew's Toko");
            System.out.println("1.Adding Stock");
            System.out.println("2.Selling items");
            System.out.println("0.Exit");
       
        System.out.println("Exit = 0");
        i = scan.nextInt();
    
        switch(i){
            
            
            
            
            case 1 : 
                do{
                     System.out.println("Which Items you will Add");
                System.out.println("1.Mobile Phone");
                System.out.println("2.Terminal");
                System.out.println("3.TV");
                    System.out.println("0.Back to Menu");
                System.out.println("=");
                j = scan.nextInt();
                switch(j){
                    case 1 :  
                        int temp = 0 ;
                        System.out.println("How many stocks of Mobile Phone");
                        System.out.println("=");
                       
                       temp = scan.nextInt();
                       stockMobile = stockMobile + temp;
                        System.out.println("Total Stock = "+stockMobile);
                        break;
                    case 2 :
                       
                        System.out.println("How many stocks of Terminal");
                        System.out.println("=");
                        
                        temp = scan.nextInt();
                        stockTerminal = stockTerminal + temp;
                        System.out.println("Total Stock = "+stockTerminal);
                        break;
                    case 3 :
                        System.out.println("How many stocks of TV");
                        System.out.println("=");
                        
                        temp = scan.nextInt();
                        stockTv = stockTv + temp;
                        System.out.println("Total Stock = "+stockTv);
                        break;
                    
                       
                        
 
                }
                }while(j!=0);
                
                break;
            case 2 : 
                System.out.println("Which Item will you sell");
                System.out.println("1.Mobile Phone");
                System.out.println("2.Terminal");
                System.out.println("3.TV");
                k = scan.nextInt();
                
                switch(k){
                    case 1 : System.out.println("Enter Your Name = ");
                        yourName = scan.nextLine();
                        for(int l = 0; l<yourName.length();l++){
                            if(yourName.charAt(l)=='a'||yourName.charAt(l)=='e'||yourName.charAt(l)=='o'||yourName.charAt(l)=='i'||yourName.charAt(l)
                                    =='u'){
                            totalVocalname = totalVocalname + 1;
                            }
                        }
                            
                        System.out.println("How much Mobile Phone will you sell?");
                        sellMobile = scan.nextInt();
                        //variable untuk mengetahui jumlah barang yang ingin dibeli.
                        if(stockMobile<sellMobile){
                            System.out.println("No more Stock!");
                        }
                        else { 
                         stockMobile = stockMobile - sellMobile;
                        sellMobile = sellMobile * 1500000;
                        if(totalVocalname>0){
                          sellMobile = sellMobile - (sellMobile * totalVocalname / 100);
                            System.out.println("totalHarga"+sellMobile);
                        
                        }
                        else{
                            System.out.println("totalHarga"+sellMobile);
                        }
                        }
                        
                        break;
                    case 2 :
                        System.out.println("Enter Your Name = ");
                        yourName = scan.nextLine();
                         for(int l = 0; l<yourName.length();l++){
                            if(yourName.charAt(l)=='a'||yourName.charAt(l)=='e'||yourName.charAt(l)=='o'||yourName.charAt(l)=='i'||yourName.charAt(l)
                                    =='u'){
                                totalVocalname = totalVocalname + 1;
                                
                            }
                             System.out.println("How much Terminal will you sell?");
                        sellTerminal = scan.nextInt();
                        //variable untuk mengetahui jumlah barang yang ingin dibeli.
                        if(stockTerminal<sellTerminal){
                            System.out.println("No more Stock!");
                        }
                        else { 
                         stockTerminal = stockTerminal - sellTerminal;
                        sellTerminal = sellTerminal * 1500000;
                        if(totalVocalname>0){
                          sellTerminal = sellTerminal - (sellTerminal * totalVocalname / 100);
                            System.out.println("totalHarga"+sellTerminal);
                        
                        }
                        else{
                            System.out.println("totalHarga"+sellTerminal);}
                    
                        
                
                   
                        }
                        
                        
                   }
                             break      ;
               
            case 3 : 
                System.out.println("===TV===");
                System.out.println("Price = RP 5.000.000");
                System.out.println("How many Mobile Phones will you sell?");
                System.out.println("=");
                tv = scan.nextInt();
                break;
            default :
                System.out.println("Wrong Answer.");
                break;
        
        }
          
  
        }
      
       
          
     
        }while(i!=0);
    
        }
}      
       