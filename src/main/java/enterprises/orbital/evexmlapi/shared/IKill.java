package enterprises.orbital.evexmlapi.shared;

import java.util.Collection;
import java.util.Date;

public interface IKill {
  public Collection<IKillAttacker> getAttackers();

  public Collection<IKillItem> getItems();

  public long getKillID();

  public Date getKillTime();

  public int getMoonID();

  public long getSolarSystemID();

  public IKillVictim getVictim();
}
