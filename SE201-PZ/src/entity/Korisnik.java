/***********************************************************************
 * Module:  Korisnik.java
 * Author:  Uros
 * Purpose: Defines the Class Korisnik
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid 68c0307d-c2ad-4380-90d2-25022994bd8c */
public class Korisnik extends Osoba {
   /** @pdOid 3caa387e-1544-4eae-8e0a-bc57bb2d4b62 */
   private int idKorisnik;
   /** @pdOid ec80262c-1da2-4794-86e6-2bd0001900db */
   private String tipKlijenta;
   
   /** @pdOid b06265c4-9b09-407c-819f-67de7f07daec */
   public Korisnik() {
      // TODO: implement
   }
   
   /** @pdOid bc96f25b-86d0-4801-836a-c888bfd3b4d3 */
   public int getIdKorisnik() {
      return idKorisnik;
   }
   
   /** @param newIdKorisnik
    * @pdOid 83e37880-c9db-4db6-9794-e6d0e6ddacc3 */
   public void setIdKorisnik(int newIdKorisnik) {
      idKorisnik = newIdKorisnik;
   }
   
   /** @pdOid d1698aaf-82ae-403d-a7f1-faa597d350a7 */
   public String getTipKlijenta() {
      return tipKlijenta;
   }
   
   /** @param newTipKlijenta
    * @pdOid 4f058124-c2e0-474a-99b9-6d5e50033d43 */
   public void setTipKlijenta(String newTipKlijenta) {
      tipKlijenta = newTipKlijenta;
   }

}