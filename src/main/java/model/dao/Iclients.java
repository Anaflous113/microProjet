package model.dao;

import java.util.List;

import model.entites.clients;
public interface Iclients {
public  List<clients> getAllClients();
List<clients> getClientsParMC(String mc);
void ajouterClients(clients c);

}
