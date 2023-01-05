package data;

import model.Client;
import model.Driver;
import model.License;
import model.Taxi;

import java.util.HashSet;
import java.util.Set;

public class Database {
public Set<Client>clientSet = new HashSet<>();
public Set<Driver>driverSet = new HashSet<>();
public Set<License>licenseSet = new HashSet<>();
public Set<Taxi>taxiSet = new HashSet<>();

}
