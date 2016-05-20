/***********************************************************************
 * Module:  Dado.java
 * Author:  BrandonEstefan
 * Purpose: Defines the Class Dado
 ***********************************************************************/
package Modelos;
import java.util.*;

/** @pdOid 32d02483-39a3-45da-a6de-f7ad67a1c940 */
public class Dado {
   /** @pdRoleInfo migr=no name=Criatura assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Criatura> criatura;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Criatura> getCriatura() {
      if (criatura == null)
         criatura = new java.util.HashSet<Criatura>();
      return criatura;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCriatura() {
      if (criatura == null)
         criatura = new java.util.HashSet<Criatura>();
      return criatura.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCriatura */
   public void setCriatura(java.util.Collection<Criatura> newCriatura) {
      removeAllCriatura();
      for (java.util.Iterator iter = newCriatura.iterator(); iter.hasNext();)
         addCriatura((Criatura)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCriatura */
   public void addCriatura(Criatura newCriatura) {
      if (newCriatura == null)
         return;
      if (this.criatura == null)
         this.criatura = new java.util.HashSet<Criatura>();
      if (!this.criatura.contains(newCriatura))
         this.criatura.add(newCriatura);
   }
   
   /** @pdGenerated default remove
     * @param oldCriatura */
   public void removeCriatura(Criatura oldCriatura) {
      if (oldCriatura == null)
         return;
      if (this.criatura != null)
         if (this.criatura.contains(oldCriatura))
            this.criatura.remove(oldCriatura);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCriatura() {
      if (criatura != null)
         criatura.clear();
   }

}