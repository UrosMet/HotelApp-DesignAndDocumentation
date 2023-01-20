/***********************************************************************
 * Module:  Rezervacija.java
 * Author:  Uros
 * Purpose: Defines the Class Rezervacija
 ***********************************************************************/
package entity;
import exception.CenaException;
import java.util.*;

/** @pdOid 3fbe9303-4e3e-4660-909a-3783794d9215 */
public class Rezervacija implements RezervacijaInterface {
   /** @pdOid b9127287-e8ef-4e11-9f92-279a7dbe2104 */
   private int idRezervacija;
   /** @pdOid 18141dfd-b9f8-4f86-ad53-2c937aca7f46 */
   private Date datum;
   /** @pdOid 7e6e7bfd-7849-4559-8698-828f719ab311 */
   private double ukupnaCena;
   
   /** @pdRoleInfo migr=no name=Spa assc=association1 mult=0..1 type=Composition */
   public Spa spa;
   /** @pdRoleInfo migr=no name=Restoran assc=association2 mult=0..1 type=Composition */
   public Restoran restoran;
   /** @pdRoleInfo migr=no name=Automobil assc=association3 mult=0..1 type=Composition */
   public Automobil automobil;
   /** @pdRoleInfo migr=no name=Korisnik assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Korisnik> korisnik;
   /** @pdRoleInfo migr=no name=Soba assc=association7 mult=1..1 type=Composition */
   public Soba soba;
   
   /** @pdOid b9bad26c-1ea8-413c-8e06-41faa5d604e0 */
   public Rezervacija() {
      // TODO: implement
   }
   
   /** @pdOid 5a909b6a-8cfe-4efa-b952-8ef21e1334c8 */
   public int getIdRezervacija() {
      return idRezervacija;
   }
   
   /** @param newIdRezervacija
    * @pdOid 2b458ba4-98ca-469f-af7a-53f0ea39393b */
   public void setIdRezervacija(int newIdRezervacija) {
      idRezervacija = newIdRezervacija;
   }
   
   /** @pdOid 6aa2ac4c-49dc-4683-9722-9a6650dee265 */
   public Date getDatum() {
      return datum;
   }
   
   /** @param newDatum
    * @pdOid a146868c-e35d-4649-ae54-400b85c93d34 */
   public void setDatum(Date newDatum) {
      datum = newDatum;
   }
   
   /** @pdOid 2019693f-f8c9-4aee-8e20-226135a0b61e */
   public double getUkupnaCena() {
      return ukupnaCena;
   }
   
   /** @param newUkupnaCena
    * @pdOid 75ef1540-dd1c-4fc9-b545-9ce081b67c27 */
   public void setUkupnaCena(double newUkupnaCena) {
      ukupnaCena = newUkupnaCena;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Korisnik> getKorisnik() {
      if (korisnik == null)
         korisnik = new java.util.HashSet<Korisnik>();
      return korisnik;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKorisnik() {
      if (korisnik == null)
         korisnik = new java.util.HashSet<Korisnik>();
      return korisnik.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKorisnik */
   public void setKorisnik(java.util.Collection<Korisnik> newKorisnik) {
      removeAllKorisnik();
      for (java.util.Iterator iter = newKorisnik.iterator(); iter.hasNext();)
         addKorisnik((Korisnik)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKorisnik */
   public void addKorisnik(Korisnik newKorisnik) {
      if (newKorisnik == null)
         return;
      if (this.korisnik == null)
         this.korisnik = new java.util.HashSet<Korisnik>();
      if (!this.korisnik.contains(newKorisnik))
         this.korisnik.add(newKorisnik);
   }
   
   /** @pdGenerated default remove
     * @param oldKorisnik */
   public void removeKorisnik(Korisnik oldKorisnik) {
      if (oldKorisnik == null)
         return;
      if (this.korisnik != null)
         if (this.korisnik.contains(oldKorisnik))
            this.korisnik.remove(oldKorisnik);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKorisnik() {
      if (korisnik != null)
         korisnik.clear();
   }

    @Override
    public void dodajRezervaciju() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean izbrisiRezervaciju() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rezervacija izmeniRezervaciju() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double dodajNaCenu(double cena) throws CenaException{
        if (cena>0) {
            return this.ukupnaCena+cena;
        }else{
            throw new CenaException("Ne mozete dodati manje od 1");
        }
    }

}