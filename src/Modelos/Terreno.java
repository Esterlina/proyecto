/***********************************************************************
 * Module:  Terreno.java
 * Author:  BrandonEstefan
 * Purpose: Defines the Class Terreno
 ***********************************************************************/
package Modelos;
import java.util.*;

/** @pdOid 756eba04-d515-45d3-8784-2920c52cf2da */
public class Terreno {
   /** @pdRoleInfo migr=no name=Posicion assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Posicion> posicion;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Posicion> getPosicion() {
      if (posicion == null)
         posicion = new java.util.HashSet<Posicion>();
      return posicion;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPosicion() {
      if (posicion == null)
         posicion = new java.util.HashSet<Posicion>();
      return posicion.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPosicion */
   public void setPosicion(java.util.Collection<Posicion> newPosicion) {
      removeAllPosicion();
      for (java.util.Iterator iter = newPosicion.iterator(); iter.hasNext();)
         addPosicion((Posicion)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPosicion */
   public void addPosicion(Posicion newPosicion) {
      if (newPosicion == null)
         return;
      if (this.posicion == null)
         this.posicion = new java.util.HashSet<Posicion>();
      if (!this.posicion.contains(newPosicion))
         this.posicion.add(newPosicion);
   }
   
   /** @pdGenerated default remove
     * @param oldPosicion */
   public void removePosicion(Posicion oldPosicion) {
      if (oldPosicion == null)
         return;
      if (this.posicion != null)
         if (this.posicion.contains(oldPosicion))
            this.posicion.remove(oldPosicion);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPosicion() {
      if (posicion != null)
         posicion.clear();
   }

}