package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class Truck extends Vehicle
{
  Truck()
  {
    super();
  }

  public Truck(final Garage garage)
  {
    super(garage);
  }
}
