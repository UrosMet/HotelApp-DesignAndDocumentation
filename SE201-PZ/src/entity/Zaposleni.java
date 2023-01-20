/***********************************************************************
 * Module:  Zaposleni.java
 * Author:  Uros
 * Purpose: Defines the Class Zaposleni
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid 91c8c4b9-10e0-4847-85eb-36038d6c4dc6 */
public class Zaposleni extends Osoba {
   /** @pdOid ebd1d3fa-af11-47e6-a415-34bacb757879 */
   private int idZaposleni;
   /** @pdOid 19e75708-c552-4451-9512-6f097d914c51 */
   private String sektor;
   
   /** @pdOid 2bd91190-1871-4a6a-964a-d5f781b9a05c */
   public Zaposleni() {
      // TODO: implement
   }
   
   /** @pdOid 489e6022-4ab2-4664-bd10-48fc7a1d6278 */
   public int getIdZaposleni() {
      return idZaposleni;
   }
   
   /** @param newIdZaposleni
    * @pdOid 3e0bb6df-84fb-4ada-be5d-925389ee8bd6 */
   public void setIdZaposleni(int newIdZaposleni) {
      idZaposleni = newIdZaposleni;
   }
   
   /** @pdOid 99bf77bd-12af-44c6-86f4-4fda06f7a824 */
   public String getSektor() {
      return sektor;
   }
   
   /** @param newSektor
    * @pdOid 3e793116-fb00-4fe4-a5a0-c8160924fd76 */
   public void setSektor(String newSektor) {
      sektor = newSektor;
   }

}