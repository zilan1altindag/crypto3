 import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;

public class CryptoUtilsDecrypt {
   public static String getMD5(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("MD5");
         var1.update(var0.getBytes(), 0, var0.length());
         return (new BigInteger(1, var1.digest())).toString(16);
      } catch (Exception var2) {
         System.err.println(var2);
         return "error";
      }
   }

   public static void main(String[] var0) {
      System.out.println("6343412643c9f99b35ca18ef20903cfc");
            String var1 = "bYa8mOvRTQRaBAZp";
            File var2 = new File("flag.enc");
            File var3 = new File("output.txt");

            try {
               CryptoUtils.decrypt(var1, var2, var3);
            } catch (CryptoException var5) {
               System.out.println(var5.getMessage());
               var5.printStackTrace();
            }
         

   }
}
    