/***********************************************************************
 * Module:  Hotel.java
 * Author:  Uros
 * Purpose: Defines the Class Hotel
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid 9bd3e39f-701d-43ba-b9b1-600ffd0996ad */
public class Hotel {
   /** @pdOid f828bd4f-3ff4-48bf-9731-bff19d7b82b6 */
   private int idHotel;
   /** @pdOid f3ab361d-9d12-4c00-a5f3-a771b7f80422 */
   private String naziv;
   /** @pdOid f5920521-19b2-4d86-b70c-ced6034c5fac */
   private String adresa;
   /** @pdOid 2be8c05d-508a-41ec-acf4-6bae71466400 */
   private int brojZvezdica;
   
   /** @pdRoleInfo migr=no name=Rezervacija assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Rezervacija> rezervacija;
   /** @pdRoleInfo migr=no name=Zaposleni assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Zaposleni> zaposleni;
   /** @pdRoleInfo migr=no name=Automobil assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Automobil> automobil;
   /** @pdRoleInfo migr=no name=Soba assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Soba> soba;
   /** @pdRoleInfo migr=no name=Spa assc=association10 mult=0..1 type=Composition */
   public Spa spa;
   /** @pdRoleInfo migr=no name=Restoran assc=association11 mult=0..1 type=Composition */
   public Restoran restoran;
   
   /** @pdOid de29596e-d0a7-4234-bfb5-b4678c506e12 */
   public Hotel() {
      // TODO: implement
   }
   
   /** @pdOid a69af026-3e67-45c9-a5be-a95a893620bb */
   public int getIdHotel() {
      return idHotel;
   }
   
   /** @param newIdHotel
    * @pdOid 1695b960-0c1f-43af-9ffe-0258607ed8d2 */
   public void setIdHotel(int newIdHotel) {
      idHotel = newIdHotel;
   }
   
   /** @pdOid eb515628-8294-4b6a-9e63-d4e1b14e9973 */
   public String getNaziv() {
      return naziv;
   }
   
   /** @param newNaziv
    * @pdOid e438f96f-3f8e-49fc-84f7-b74788677390 */
   public void setNaziv(String newNaziv) {
      naziv = newNaziv;
   }
   
   /** @pdOid fdc2d289-0bd6-424a-8f9c-dabddf575bdb */
   public String getAdresa() {
      return adresa;
   }
   
   /** @param newAdresa
    * @pdOid 993e9460-0ced-4e7e-aacf-04dd8719aeee */
   public void setAdresa(String newAdresa) {
      adresa = newAdresa;
   }
   
   /** @pdOid 94a7a553-a7e7-47f3-887e-aec377ed3b49 */
   public int getBrojZvezdica() {
      return brojZvezdica;
   }
   
   /** @param newBrojZvezdica
    * @pdOid 2c7025bc-a208-421b-b751-3f465b8cc268 */
   public void setBrojZvezdica(int newBrojZvezdica) {
      brojZvezdica = newBrojZvezdica;
   }
   
   /** @pdOid 6b0fb515-3df7-48a2-b964-ae89e9a1021e */
   public Hotel hotel() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Rezervacija> getRezervacija() {
      if (rezervacija == null)
         rezervacija = new java.util.HashSet<Rezervacija>();
      return rezervacija;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRezervacija() {
      if (rezervacija == null)
         rezervacija = new java.util.HashSet<Rezervacija>();
      return rezervacija.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRezervacija */
   public void setRezervacija(java.util.Collection<Rezervacija> newRezervacija) {
      removeAllRezervacija();
      for (java.util.Iterator iter = newRezervacija.iterator(); iter.hasNext();)
         addRezervacija((Rezervacija)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRezervacija */
   public void addRezervacija(Rezervacija newRezervacija) {
      if (newRezervacija == null)
         return;
      if (this.rezervacija == null)
         this.rezervacija = new java.util.HashSet<Rezervacija>();
      if (!this.rezervacija.contains(newRezervacija))
         this.rezervacija.add(newRezervacija);
   }
   
   /** @pdGenerated default remove
     * @param oldRezervacija */
   public void removeRezervacija(Rezervacija oldRezervacija) {
      if (oldRezervacija == null)
         return;
      if (this.rezervacija != null)
         if (this.rezervacija.contains(oldRezervacija))
            this.rezervacija.remove(oldRezervacija);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRezervacija() {
      if (rezervacija != null)
         rezervacija.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Zaposleni> getZaposleni() {
      if (zaposleni == null)
         zaposleni = new java.util.HashSet<Zaposleni>();
      return zaposleni;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorZaposleni() {
      if (zaposleni == null)
         zaposleni = new java.util.HashSet<Zaposleni>();
      return zaposleni.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newZaposleni */
   public void setZaposleni(java.util.Collection<Zaposleni> newZaposleni) {
      removeAllZaposleni();
      for (java.util.Iterator iter = newZaposleni.iterator(); iter.hasNext();)
         addZaposleni((Zaposleni)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newZaposleni */
   public void addZaposleni(Zaposleni newZaposleni) {
      if (newZaposleni == null)
         return;
      if (this.zaposleni == null)
         this.zaposleni = new java.util.HashSet<Zaposleni>();
      if (!this.zaposleni.contains(newZaposleni))
         this.zaposleni.add(newZaposleni);
   }
   
   /** @pdGenerated default remove
     * @param oldZaposleni */
   public void removeZaposleni(Zaposleni oldZaposleni) {
      if (oldZaposleni == null)
         return;
      if (this.zaposleni != null)
         if (this.zaposleni.contains(oldZaposleni))
            this.zaposleni.remove(oldZaposleni);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllZaposleni() {
      if (zaposleni != null)
         zaposleni.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Automobil> getAutomobil() {
      if (automobil == null)
         automobil = new java.util.HashSet<Automobil>();
      return automobil;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAutomobil() {
      if (automobil == null)
         automobil = new java.util.HashSet<Automobil>();
      return automobil.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAutomobil */
   public void setAutomobil(java.util.Collection<Automobil> newAutomobil) {
      removeAllAutomobil();
      for (java.util.Iterator iter = newAutomobil.iterator(); iter.hasNext();)
         addAutomobil((Automobil)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAutomobil */
   public void addAutomobil(Automobil newAutomobil) {
      if (newAutomobil == null)
         return;
      if (this.automobil == null)
         this.automobil = new java.util.HashSet<Automobil>();
      if (!this.automobil.contains(newAutomobil))
         this.automobil.add(newAutomobil);
   }
   
   /** @pdGenerated default remove
     * @param oldAutomobil */
   public void removeAutomobil(Automobil oldAutomobil) {
      if (oldAutomobil == null)
         return;
      if (this.automobil != null)
         if (this.automobil.contains(oldAutomobil))
            this.automobil.remove(oldAutomobil);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAutomobil() {
      if (automobil != null)
         automobil.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Soba> getSoba() {
      if (soba == null)
         soba = new java.util.HashSet<Soba>();
      return soba;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSoba() {
      if (soba == null)
         soba = new java.util.HashSet<Soba>();
      return soba.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSoba */
   public void setSoba(java.util.Collection<Soba> newSoba) {
      removeAllSoba();
      for (java.util.Iterator iter = newSoba.iterator(); iter.hasNext();)
         addSoba((Soba)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSoba */
   public void addSoba(Soba newSoba) {
      if (newSoba == null)
         return;
      if (this.soba == null)
         this.soba = new java.util.HashSet<Soba>();
      if (!this.soba.contains(newSoba))
         this.soba.add(newSoba);
   }
   
   /** @pdGenerated default remove
     * @param oldSoba */
   public void removeSoba(Soba oldSoba) {
      if (oldSoba == null)
         return;
      if (this.soba != null)
         if (this.soba.contains(oldSoba))
            this.soba.remove(oldSoba);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSoba() {
      if (soba != null)
         soba.clear();
   }

}