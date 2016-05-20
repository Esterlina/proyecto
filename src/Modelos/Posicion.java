/***********************************************************************
 * Module:  Posicion.java
 * Author:  Esterlina
 * Purpose: Defines the Class Posicion
 ***********************************************************************/
package Modelos;
import java.util.*;

/** @pdOid bb2ea492-da12-408d-9a69-4617300dc24c */
public class Posicion {
   /** @pdRoleInfo migr=no name=ElementoEnCampo assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<ElementoEnCampo> elementoEnCampo;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ElementoEnCampo> getElementoEnCampo() {
      if (elementoEnCampo == null)
         elementoEnCampo = new java.util.HashSet<ElementoEnCampo>();
      return elementoEnCampo;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorElementoEnCampo() {
      if (elementoEnCampo == null)
         elementoEnCampo = new java.util.HashSet<ElementoEnCampo>();
      return elementoEnCampo.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newElementoEnCampo */
   public void setElementoEnCampo(java.util.Collection<ElementoEnCampo> newElementoEnCampo) {
      removeAllElementoEnCampo();
      for (java.util.Iterator iter = newElementoEnCampo.iterator(); iter.hasNext();)
         addElementoEnCampo((ElementoEnCampo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newElementoEnCampo */
   public void addElementoEnCampo(ElementoEnCampo newElementoEnCampo) {
      if (newElementoEnCampo == null)
         return;
      if (this.elementoEnCampo == null)
         this.elementoEnCampo = new java.util.HashSet<ElementoEnCampo>();
      if (!this.elementoEnCampo.contains(newElementoEnCampo))
         this.elementoEnCampo.add(newElementoEnCampo);
   }
   
   /** @pdGenerated default remove
     * @param oldElementoEnCampo */
   public void removeElementoEnCampo(ElementoEnCampo oldElementoEnCampo) {
      if (oldElementoEnCampo == null)
         return;
      if (this.elementoEnCampo != null)
         if (this.elementoEnCampo.contains(oldElementoEnCampo))
            this.elementoEnCampo.remove(oldElementoEnCampo);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllElementoEnCampo() {
      if (elementoEnCampo != null)
         elementoEnCampo.clear();
   }

}