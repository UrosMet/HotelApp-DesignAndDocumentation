/***********************************************************************
 * Module:  Soba.java
 * Author:  Uros
 * Purpose: Defines the Class Soba
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid 634d3eb4-4573-4a26-88a5-9fe8b960d27d */
public abstract class Soba {
   /** @pdOid 6b166361-2275-495f-9d75-646e96155e9c */
   private int idSoba;
   /** @pdOid cca78f73-ec2d-45b9-996d-78befb9f0eb9 */
   private double cena;
   /** @pdOid 96de6862-d1a8-4648-93a5-1fd6f8975108 */
   private String nivoSobe;
   
   /** @pdOid 0cb9296c-06ab-49e5-8f61-9ca628913c5f */
   public Soba() {
      // TODO: implement
   }
   
   /** @pdOid dba2359c-dbeb-4bfe-8078-8f334246dd44 */
   public int getIdSoba() {
      return idSoba;
   }
   
   /** @param newIdSoba
    * @pdOid 3e8e1140-5161-4549-801b-0e8ff13e317c */
   public void setIdSoba(int newIdSoba) {
      idSoba = newIdSoba;
   }
   
   /** @pdOid 465f5eb0-6bb6-4681-b306-e82b273f94a1 */
   public double getCena() {
      return cena;
   }
   
   /** @param newCena
    * @pdOid 4891bb8c-772b-474f-9bd1-6c115a02e5c3 */
   public void setCena(double newCena) {
      cena = newCena;
   }
   
   /** @pdOid 09a9fdee-6058-47f6-bdca-942825e45b15 */
   public String getNivoSobe() {
      return nivoSobe;
   }
   
   /** @param newNivoSobe
    * @pdOid 9502b0a9-f28d-4032-b29d-5da97c9022c1 */
   public void setNivoSobe(String newNivoSobe) {
      nivoSobe = newNivoSobe;
   }

}