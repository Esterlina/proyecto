/***********************************************************************
 * Module:  PuzzleDeDados.java
 * Author:  Esterlina
 * Purpose: Defines the Class PuzzleDeDados
 ***********************************************************************/
package Modelos;
import java.util.*;

/** @pdOid eb320e7d-1269-42cf-95a2-ce40eed59ab9 */
public class PuzzleDeDados {
   /** @pdRoleInfo migr=no name=Dado assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Dado> dado;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Dado> getDado() {
      if (dado == null)
         dado = new java.util.HashSet<Dado>();
      return dado;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDado() {
      if (dado == null)
         dado = new java.util.HashSet<Dado>();
      return dado.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDado */
   public void setDado(java.util.Collection<Dado> newDado) {
      removeAllDado();
      for (java.util.Iterator iter = newDado.iterator(); iter.hasNext();)
         addDado((Dado)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDado */
   public void addDado(Dado newDado) {
      if (newDado == null)
         return;
      if (this.dado == null)
         this.dado = new java.util.HashSet<Dado>();
      if (!this.dado.contains(newDado))
         this.dado.add(newDado);
   }
   
   /** @pdGenerated default remove
     * @param oldDado */
   public void removeDado(Dado oldDado) {
      if (oldDado == null)
         return;
      if (this.dado != null)
         if (this.dado.contains(oldDado))
            this.dado.remove(oldDado);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDado() {
      if (dado != null)
         dado.clear();
   }

}