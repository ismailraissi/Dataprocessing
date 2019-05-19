package p2_DAO_één_op_veel_relatie_inleveropdracht;

import java.util.List;

public class OvChipkaartDao {
	public List<OVChipkaart> findByReiziger(int reizigerId);

	public OVChipkaart save(OVChipkaart ovChipkaart);

	public OVChipkaart update(OvChipkaart ovChipkaart);

	public boolean delete(OVChipkaart ovChipkaart);
}
