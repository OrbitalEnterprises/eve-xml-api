package enterprises.orbital.evexmlapi.eve;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = IFactionVictoryPointStat.class)
public interface IFactionVictoryPointStat extends IVictoryPointStat {
  public int getFactionID();

  public String getFactionName();
}
