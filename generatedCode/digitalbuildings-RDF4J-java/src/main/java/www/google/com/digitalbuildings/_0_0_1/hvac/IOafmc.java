package www.google.com.digitalbuildings._0_0_1.hvac;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.IControl;
import www.google.com.digitalbuildings._0_0_1.fields.IEconomizer_mode;
import www.google.com.digitalbuildings._0_0_1.fields.IMixed_air_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IOutside_air_flowrate_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IOutside_air_damper_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.IVentilation_outside_air_flowrate_setpoint;
/**
* Class Oafmc 
* Outside air flow control with minimum setpoint.
*/
public interface IOafmc extends IFunctionality, IControl{

	public IRI iri();

    public void addUsesOptionalsEconomizer_mode (IEconomizer_mode parameter);

	public Set<IEconomizer_mode> getUsesOptionalsEconomizer_mode();

    public void addUsesOptionalsMixed_air_temperature_sensor (IMixed_air_temperature_sensor parameter);

	public Set<IMixed_air_temperature_sensor> getUsesOptionalsMixed_air_temperature_sensor();

    public void addUsesOutside_air_damper_percentage_command (IOutside_air_damper_percentage_command parameter);

	public Set<IOutside_air_damper_percentage_command> getUsesOutside_air_damper_percentage_command();

    public void addUsesOutside_air_flowrate_sensor (IOutside_air_flowrate_sensor parameter);

	public Set<IOutside_air_flowrate_sensor> getUsesOutside_air_flowrate_sensor();

    public void addUsesVentilation_outside_air_flowrate_setpoint (IVentilation_outside_air_flowrate_setpoint parameter);

	public Set<IVentilation_outside_air_flowrate_setpoint> getUsesVentilation_outside_air_flowrate_setpoint();

}