/***********************************************************************
 * Module:  Automobil.java
 * Author:  Uros
 * Purpose: Defines the Class Automobil
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid 71692f8d-de0f-4b86-b84a-4ce8e498ff94 */
public class Automobil {
   /** @pdOid 0a38a3a3-9668-40e0-968e-67e235c19693 */
   private int idAutomobila;
   /** @pdOid 9b390af7-9518-4c1a-b141-0c2d60c464e8 */
   private int marka;
   /** @pdOid 73981e3d-8539-4d11-ab6a-0afba360e51c */
   private int model;
   /** @pdOid 4c797242-a1e9-4e3f-9a02-32934c447679 */
   private int godiste;
   
   /** @pdOid 3b9c7455-992d-4221-903b-da5d334c2b01 */
   public Automobil() {
      // TODO: implement
   }
   
   /** @pdOid a813891b-ba55-40c4-89b4-dec7ac5b0ebb */
   public int getIdAutomobila() {
      return idAutomobila;
   }
   
   /** @param newIdAutomobila
    * @pdOid ca68dc93-fcd2-4b44-935f-957c2f545f29 */
   public void setIdAutomobila(int newIdAutomobila) {
      idAutomobila = newIdAutomobila;
   }
   
   /** @pdOid 247b1fc4-4691-4494-a147-9e24466aad62 */
   public int getMarka() {
      return marka;
   }
   
   /** @param newMarka
    * @pdOid 1a71e1e0-4372-406b-ac70-6053008119b6 */
   public void setMarka(int newMarka) {
      marka = newMarka;
   }
   
   /** @pdOid 53ccbbe8-b5fe-4c26-9fcb-0fbc1bbb010a */
   public int getModel() {
      return model;
   }
   
   /** @param newModel
    * @pdOid 0abcde2a-a9d2-48ee-aabb-df968c6cfdb2 */
   public void setModel(int newModel) {
      model = newModel;
   }
   
   /** @pdOid 84e31134-869d-417d-b65c-cd39d4e0c0c9 */
   public int getGodiste() {
      return godiste;
   }
   
   /** @param newGodiste
    * @pdOid 7bb39704-98d1-4769-a37d-62ce7dcab9a1 */
   public void setGodiste(int newGodiste) {
      godiste = newGodiste;
   }

}