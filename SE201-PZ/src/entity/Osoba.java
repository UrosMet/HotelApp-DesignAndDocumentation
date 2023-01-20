/***********************************************************************
 * Module:  Osoba.java
 * Author:  Uros
 * Purpose: Defines the Class Osoba
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid eafb164d-d990-4aed-9c56-c344fc37d018 */
public abstract class Osoba {
   /** @pdOid 4ff6cf5e-fc50-4cb7-9528-f33083750e08 */
   private String jmbg;
   /** @pdOid e5168e05-b589-429b-a776-671d07957f92 */
   private String ime;
   /** @pdOid 7e32f350-85d5-4665-bf0c-cae612ac2bd0 */
   private String prezime;
   /** @pdOid e69e85fa-bde3-4c3a-b7f2-c516c9cb1d91 */
   private String adresa;
   /** @pdOid 7a408511-96b6-4b59-b298-3b91bc0b425e */
   private String brojTelefona;
   
   /** @pdOid 803c843b-a0e7-4791-bba6-a22215db5c0e */
   public Osoba() {
      // TODO: implement
   }
   
   /** @pdOid f7b84f0a-b575-4eb2-b675-2ed0da88ab19 */
   public String getJmbg() {
      return jmbg;
   }
   
   /** @param newJmbg
    * @pdOid a29f46ba-8cf4-4f12-820d-d161feb1bf70 */
   public void setJmbg(String newJmbg) {
      jmbg = newJmbg;
   }
   
   /** @pdOid a8162d2e-3d10-4151-845b-36b1baceb77d */
   public String getIme() {
      return ime;
   }
   
   /** @param newIme
    * @pdOid 9be118cc-8c37-4dc1-b7aa-92ed30fcdffe */
   public void setIme(String newIme) {
      ime = newIme;
   }
   
   /** @pdOid be688a7b-e934-4fca-9362-f20dbf8e6714 */
   public String getPrezime() {
      return prezime;
   }
   
   /** @param newPrezime
    * @pdOid b869ea6b-89bb-444c-a880-a09c8955adbe */
   public void setPrezime(String newPrezime) {
      prezime = newPrezime;
   }
   
   /** @pdOid caab720f-336f-4a97-9efe-eb604ead8b8b */
   public String getAdresa() {
      return adresa;
   }
   
   /** @param newAdresa
    * @pdOid a8c0c5e2-09ea-4bc9-a097-3ad489d6b603 */
   public void setAdresa(String newAdresa) {
      adresa = newAdresa;
   }
   
   /** @pdOid a3986c85-aff0-48d0-ae55-d448751b5e77 */
   public String getBrojTelefona() {
      return brojTelefona;
   }
   
   /** @param newBrojTelefona
    * @pdOid ef593044-1919-4cba-b5bf-691b2a163cba */
   public void setBrojTelefona(String newBrojTelefona) {
      brojTelefona = newBrojTelefona;
   }

}