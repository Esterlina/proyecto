/***********************************************************************
 * Module:  Jugador.java
 * Author:  Esterlina
 * Purpose: Defines the Class Jugador
 ***********************************************************************/
package Modelos;
import java.util.*;

/** @pdOid fb9ed831-0990-4e68-ba43-5dde1d1b7916 */
public class Jugador {
   /** @pdRoleInfo migr=no name=Terreno assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Terreno> terreno;
   /** @pdRoleInfo migr=no name=Turno assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Turno> turno;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Terreno> getTerreno() {
      if (terreno == null)
         terreno = new java.util.HashSet<Terreno>();
      return terreno;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTerreno() {
      if (terreno == null)
         terreno = new java.util.HashSet<Terreno>();
      return terreno.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTerreno */
   public void setTerreno(java.util.Collection<Terreno> newTerreno) {
      removeAllTerreno();
      for (java.util.Iterator iter = newTerreno.iterator(); iter.hasNext();)
         addTerreno((Terreno)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTerreno */
   public void addTerreno(Terreno newTerreno) {
      if (newTerreno == null)
         return;
      if (this.terreno == null)
         this.terreno = new java.util.HashSet<Terreno>();
      if (!this.terreno.contains(newTerreno))
         this.terreno.add(newTerreno);
   }
   
   /** @pdGenerated default remove
     * @param oldTerreno */
   public void removeTerreno(Terreno oldTerreno) {
      if (oldTerreno == null)
         return;
      if (this.terreno != null)
         if (this.terreno.contains(oldTerreno))
            this.terreno.remove(oldTerreno);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTerreno() {
      if (terreno != null)
         terreno.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Turno> getTurno() {
      if (turno == null)
         turno = new java.util.HashSet<Turno>();
      return turno;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTurno() {
      if (turno == null)
         turno = new java.util.HashSet<Turno>();
      return turno.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTurno */
   public void setTurno(java.util.Collection<Turno> newTurno) {
      removeAllTurno();
      for (java.util.Iterator iter = newTurno.iterator(); iter.hasNext();)
         addTurno((Turno)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTurno */
   public void addTurno(Turno newTurno) {
      if (newTurno == null)
         return;
      if (this.turno == null)
         this.turno = new java.util.HashSet<Turno>();
      if (!this.turno.contains(newTurno))
         this.turno.add(newTurno);
   }
   
   /** @pdGenerated default remove
     * @param oldTurno */
   public void removeTurno(Turno oldTurno) {
      if (oldTurno == null)
         return;
      if (this.turno != null)
         if (this.turno.contains(oldTurno))
            this.turno.remove(oldTurno);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTurno() {
      if (turno != null)
         turno.clear();
   }

}