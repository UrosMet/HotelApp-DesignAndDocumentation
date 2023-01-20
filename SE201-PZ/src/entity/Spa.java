/***********************************************************************
 * Module:  Spa.java
 * Author:  Uros
 * Purpose: Defines the Class Spa
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid ef251056-8b2e-4f6f-a516-7a9b104f9704 */
public abstract class Spa {
   /** @pdOid b5617f93-4f8a-43df-b5b5-aefaea86c079 */
   private double cena;
   /** @pdOid dfee2cba-1aa4-4c48-8a4a-60896e185e2c */
   private Date datum;
   
   /** @pdOid 6ddfd639-5f0d-455d-8c2e-b313d79e29c1 */
   public Spa() {
      // TODO: implement
   }
   
   /** @pdOid 21039e32-8419-45d8-a5aa-268b25ae75a7 */
   public double getCena() {
      return cena;
   }
   
   /** @param newCena
    * @pdOid 2a2e20e1-3194-4247-96dc-2f0735fc28a7 */
   public void setCena(double newCena) {
      cena = newCena;
   }
   
   /** @pdOid d46b71cb-8f8f-4db0-9fd7-7af4bcc72295 */
   public Date getDatum() {
      return datum;
   }
   
   /** @param newDatum
    * @pdOid ae0a0349-74ce-4105-8566-c9f9ed0f1b5f */
   public void setDatum(Date newDatum) {
      datum = newDatum;
   }

}