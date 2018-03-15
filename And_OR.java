package and_or;


import java.util.Arrays;

 public class And_OR {
    static double delta[] = new double[2]; 
    static int data[][][] = { {{0,1,1}, {1}},
                                {{1,1,1}, {0}},
                                
                              };
     static double []w = {0,0,0};
     static int cho;
     
     static double d [] = new double[4];
       
   public static void main(String[] args) {
      double []w = {0,0,0};
     
      double d [] = new double[4];
        d[0] = data[0][1][0];
        d[1] = data[1][1][0];
      
       double output[]=new double[2];
        int x=1;
       while(!Arrays.equals(delta, new double[]{0.0,0.0})){

        System.out.println("******************* Unit #"+x+"***********************");
        for (int i = 0; i < output.length; i++) 
        {
             System.out.println("******************* For #"+i+"***********************");
            
            System.out.println("Wiegth's is :\t"+w[0]+" \t"+ w[1]+" \t"+ w[2]);
            
            System.out.println("Wiegth's is :\t"+w[0]+" \t"+ w[1]+" \t"+ w[2]);
            
            System.out.println("X's is :\t"+data[i][0][0]+" \t"+ data[i][0][1]);
            
            output[i] = (data[i][0][0] * w[0]) + (data[i][0][1] * w[1]) + (data[i][0][2] * w[2]);
            if(output[i] >= 0) output[i] = 1;
            else output[i]=0;
            
            System.out.println("Y's is :  \t" +output[i]);
        
            delta[i]= d[i] - output[i];
            
            System.out.println("delta  = :\t" +delta[i]);

             
            w[0]= w[0] +   (delta[i] * data[i][0][0]);
            w[1]= w[1] +   (delta[i] * data[i][0][1]);
            w[2]= w[2] +   (delta[i] * data[i][0][2]);


            w[0]= Math.round(w[0] * 100);
            w[0] = w[0]/100;

            w[1]= Math.round(w[1] * 100);
            w[1] = w[1]/100;

            w[2]= Math.round(w[2] * 100);
            w[2] = w[2]/100;
          }

        x++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                
        
    
}//while 
       
       
       }

   
       
    
}
