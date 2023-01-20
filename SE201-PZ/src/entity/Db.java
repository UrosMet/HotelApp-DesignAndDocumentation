/***********************************************************************
 * Module:  Db.java
 * Author:  Uros
 * Purpose: Defines the Class Db
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid 1ca7cc4f-854e-4c5c-9c29-6e47a38e8aa3 */
public class Db {
   /** @pdRoleInfo migr=no name=Db assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Db> dbB;
   
   /** @pdOid 244f7d12-f395-46c0-85c7-f35877667659 */
   public Db() {
      // TODO: implement
   }
   
   /** @pdOid 25e4507b-9d12-4e12-b3bb-efba598ec80f */
   public void dodajRezervaciju() {
      // TODO: implement
   }
   
   /** @pdOid 2efd7dfb-aaa3-493b-bfc8-340339607e4f */
   public boolean obrisiRezervaciju() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid d3ecab13-16e3-41c0-a664-e00272db2885 */
   public Rezervacija izmeniRezervaciju() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Db> getDbB() {
      if (dbB == null)
         dbB = new java.util.HashSet<Db>();
      return dbB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDbB() {
      if (dbB == null)
         dbB = new java.util.HashSet<Db>();
      return dbB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDbB */
   public void setDbB(java.util.Collection<Db> newDbB) {
      removeAllDbB();
      for (java.util.Iterator iter = newDbB.iterator(); iter.hasNext();)
         addDbB((Db)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDb */
   public void addDbB(Db newDb) {
      if (newDb == null)
         return;
      if (this.dbB == null)
         this.dbB = new java.util.HashSet<Db>();
      if (!this.dbB.contains(newDb))
         this.dbB.add(newDb);
   }
   
   /** @pdGenerated default remove
     * @param oldDb */
   public void removeDbB(Db oldDb) {
      if (oldDb == null)
         return;
      if (this.dbB != null)
         if (this.dbB.contains(oldDb))
            this.dbB.remove(oldDb);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDbB() {
      if (dbB != null)
         dbB.clear();
   }

}