/***********************************************************************
 * Module:  Trampa.java
 * Author:  Esterlina
 * Purpose: Defines the Class Trampa
 ***********************************************************************/
package Modelos;
import java.util.*;

/** @pdOid ab7259c7-306a-4833-be25-ce41b6e1d8be */
public class Trampa extends ElementoEnCampo {
   /** @pdRoleInfo migr=no name=Accion assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Accion> accion;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Accion> getAccion() {
      if (accion == null)
         accion = new java.util.HashSet<Accion>();
      return accion;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAccion() {
      if (accion == null)
         accion = new java.util.HashSet<Accion>();
      return accion.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAccion */
   public void setAccion(java.util.Collection<Accion> newAccion) {
      removeAllAccion();
      for (java.util.Iterator iter = newAccion.iterator(); iter.hasNext();)
         addAccion((Accion)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAccion */
   public void addAccion(Accion newAccion) {
      if (newAccion == null)
         return;
      if (this.accion == null)
         this.accion = new java.util.HashSet<Accion>();
      if (!this.accion.contains(newAccion))
         this.accion.add(newAccion);
   }
   
   /** @pdGenerated default remove
     * @param oldAccion */
   public void removeAccion(Accion oldAccion) {
      if (oldAccion == null)
         return;
      if (this.accion != null)
         if (this.accion.contains(oldAccion))
            this.accion.remove(oldAccion);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAccion() {
      if (accion != null)
         accion.clear();
   }

}