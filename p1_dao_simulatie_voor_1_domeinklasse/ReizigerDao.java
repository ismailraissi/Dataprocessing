package p1_dao_simulatie_voor_1_domeinklasse;

import java.util.List;

public interface ReizigerDao {
	List<Reiziger> findAll();

	List<Reiziger> findByGBdatum(String dt);

	Reiziger save(Reiziger reiziger);

	Reiziger update(Reiziger reiziger);

	boolean delete(Reiziger reiziger);
//    public void closeConnection();
}
