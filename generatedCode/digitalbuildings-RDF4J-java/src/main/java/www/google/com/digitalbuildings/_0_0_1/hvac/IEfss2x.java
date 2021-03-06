package www.google.com.digitalbuildings._0_0_1.hvac;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.IOperational;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_water_valve_percentage_command_1;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_water_valve_percentage_command_2;
import www.google.com.digitalbuildings._0_0_1.fields.IOutside_air_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_run_command;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_air_damper_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_run_status_2;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_run_status_1;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_run_status;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_frequency_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.IBuilding_air_static_pressure_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_frequency_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_air_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IBuilding_air_static_pressure_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IReturn_air_static_pressure_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_power_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_run_status;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_power_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_current_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_current_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_run_command_2;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_run_command_1;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_frequency_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICooling_thermal_power_capacity;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_air_flowrate_capacity;
import www.google.com.digitalbuildings._0_0_1.fields.IOutside_air_flowrate_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IPressurization_request_count;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_percentage_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_percentage_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_percentage_command_1;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_speed_percentage_command_2;
import www.google.com.digitalbuildings._0_0_1.fields.IMixed_air_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_speed_frequency_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_speed_percentage_command_1;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_speed_frequency_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_speed_percentage_command_2;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_air_damper_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.ILeaving_cooling_coil_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_air_flowrate_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_run_command_2;
import www.google.com.digitalbuildings._0_0_1.fields.IEconomizer_mode;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_power_capacity;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_air_temperature_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_air_static_pressure_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_run_command_1;
import www.google.com.digitalbuildings._0_0_1.fields.IOutside_air_damper_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_run_status_1;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_current_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_current_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_run_status_2;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_air_static_pressure_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_power_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.IReturn_air_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IReturn_air_static_pressure_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_speed_percentage_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_speed_percentage_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.IOutside_air_flowrate_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_fan_run_command;
import www.google.com.digitalbuildings._0_0_1.fields.IExhaust_fan_power_sensor_1;
/**
* Class Efss2x 
* Exhaust fan start-stop and feedback with two fans.
*/
public interface IEfss2x extends IFunctionality, IOperational{

	public IRI iri();

    public void addUsesExhaust_fan_run_command_1 (IExhaust_fan_run_command_1 parameter);

	public Set<IExhaust_fan_run_command_1> getUsesExhaust_fan_run_command_1();

    public void addUsesExhaust_fan_run_command_2 (IExhaust_fan_run_command_2 parameter);

	public Set<IExhaust_fan_run_command_2> getUsesExhaust_fan_run_command_2();

    public void addUsesExhaust_fan_run_status_1 (IExhaust_fan_run_status_1 parameter);

	public Set<IExhaust_fan_run_status_1> getUsesExhaust_fan_run_status_1();

    public void addUsesExhaust_fan_run_status_2 (IExhaust_fan_run_status_2 parameter);

	public Set<IExhaust_fan_run_status_2> getUsesExhaust_fan_run_status_2();

    public void addUsesReturn_air_static_pressure_sensor (IReturn_air_static_pressure_sensor parameter);

	public Set<IReturn_air_static_pressure_sensor> getUsesReturn_air_static_pressure_sensor();

    public void addUsesReturn_air_static_pressure_setpoint (IReturn_air_static_pressure_setpoint parameter);

	public Set<IReturn_air_static_pressure_setpoint> getUsesReturn_air_static_pressure_setpoint();

    public void addUsesSupply_air_static_pressure_sensor (ISupply_air_static_pressure_sensor parameter);

	public Set<ISupply_air_static_pressure_sensor> getUsesSupply_air_static_pressure_sensor();

    public void addUsesSupply_air_static_pressure_setpoint (ISupply_air_static_pressure_setpoint parameter);

	public Set<ISupply_air_static_pressure_setpoint> getUsesSupply_air_static_pressure_setpoint();

    public void addUsesChilled_water_valve_percentage_command_1 (IChilled_water_valve_percentage_command_1 parameter);

	public Set<IChilled_water_valve_percentage_command_1> getUsesChilled_water_valve_percentage_command_1();

    public void addUsesChilled_water_valve_percentage_command_2 (IChilled_water_valve_percentage_command_2 parameter);

	public Set<IChilled_water_valve_percentage_command_2> getUsesChilled_water_valve_percentage_command_2();

    public void addUsesSupply_air_temperature_sensor (ISupply_air_temperature_sensor parameter);

	public Set<ISupply_air_temperature_sensor> getUsesSupply_air_temperature_sensor();

    public void addUsesSupply_air_temperature_setpoint (ISupply_air_temperature_setpoint parameter);

	public Set<ISupply_air_temperature_setpoint> getUsesSupply_air_temperature_setpoint();

    public void addUsesBuilding_air_static_pressure_sensor (IBuilding_air_static_pressure_sensor parameter);

	public Set<IBuilding_air_static_pressure_sensor> getUsesBuilding_air_static_pressure_sensor();

    public void addUsesBuilding_air_static_pressure_setpoint (IBuilding_air_static_pressure_setpoint parameter);

	public Set<IBuilding_air_static_pressure_setpoint> getUsesBuilding_air_static_pressure_setpoint();

    public void addUsesExhaust_fan_run_command (IExhaust_fan_run_command parameter);

	public Set<IExhaust_fan_run_command> getUsesExhaust_fan_run_command();

    public void addUsesEconomizer_mode (IEconomizer_mode parameter);

	public Set<IEconomizer_mode> getUsesEconomizer_mode();

    public void addUsesMixed_air_temperature_sensor (IMixed_air_temperature_sensor parameter);

	public Set<IMixed_air_temperature_sensor> getUsesMixed_air_temperature_sensor();

    public void addUsesOutside_air_damper_percentage_command (IOutside_air_damper_percentage_command parameter);

	public Set<IOutside_air_damper_percentage_command> getUsesOutside_air_damper_percentage_command();

    public void addUsesOutside_air_temperature_sensor (IOutside_air_temperature_sensor parameter);

	public Set<IOutside_air_temperature_sensor> getUsesOutside_air_temperature_sensor();

    public void addUsesReturn_air_temperature_sensor (IReturn_air_temperature_sensor parameter);

	public Set<IReturn_air_temperature_sensor> getUsesReturn_air_temperature_sensor();

    public void addUsesSupply_fan_run_command_1 (ISupply_fan_run_command_1 parameter);

	public Set<ISupply_fan_run_command_1> getUsesSupply_fan_run_command_1();

    public void addUsesSupply_fan_run_command_2 (ISupply_fan_run_command_2 parameter);

	public Set<ISupply_fan_run_command_2> getUsesSupply_fan_run_command_2();

    public void addUsesSupply_fan_run_status_1 (ISupply_fan_run_status_1 parameter);

	public Set<ISupply_fan_run_status_1> getUsesSupply_fan_run_status_1();

    public void addUsesSupply_fan_run_status_2 (ISupply_fan_run_status_2 parameter);

	public Set<ISupply_fan_run_status_2> getUsesSupply_fan_run_status_2();

    public void addUsesSupply_fan_speed_percentage_command_1 (ISupply_fan_speed_percentage_command_1 parameter);

	public Set<ISupply_fan_speed_percentage_command_1> getUsesSupply_fan_speed_percentage_command_1();

    public void addUsesSupply_fan_speed_percentage_command_2 (ISupply_fan_speed_percentage_command_2 parameter);

	public Set<ISupply_fan_speed_percentage_command_2> getUsesSupply_fan_speed_percentage_command_2();

    public void addUsesExhaust_fan_speed_percentage_command_1 (IExhaust_fan_speed_percentage_command_1 parameter);

	public Set<IExhaust_fan_speed_percentage_command_1> getUsesExhaust_fan_speed_percentage_command_1();

    public void addUsesExhaust_fan_speed_percentage_command_2 (IExhaust_fan_speed_percentage_command_2 parameter);

	public Set<IExhaust_fan_speed_percentage_command_2> getUsesExhaust_fan_speed_percentage_command_2();

    public void addUsesOptionalsExhaust_air_flowrate_capacity (IExhaust_air_flowrate_capacity parameter);

	public Set<IExhaust_air_flowrate_capacity> getUsesOptionalsExhaust_air_flowrate_capacity();

    public void addUsesOptionalsExhaust_fan_current_sensor_1 (IExhaust_fan_current_sensor_1 parameter);

	public Set<IExhaust_fan_current_sensor_1> getUsesOptionalsExhaust_fan_current_sensor_1();

    public void addUsesOptionalsExhaust_fan_current_sensor_2 (IExhaust_fan_current_sensor_2 parameter);

	public Set<IExhaust_fan_current_sensor_2> getUsesOptionalsExhaust_fan_current_sensor_2();

    public void addUsesOptionalsExhaust_fan_power_capacity (IExhaust_fan_power_capacity parameter);

	public Set<IExhaust_fan_power_capacity> getUsesOptionalsExhaust_fan_power_capacity();

    public void addUsesOptionalsExhaust_fan_power_sensor_1 (IExhaust_fan_power_sensor_1 parameter);

	public Set<IExhaust_fan_power_sensor_1> getUsesOptionalsExhaust_fan_power_sensor_1();

    public void addUsesOptionalsExhaust_fan_power_sensor_2 (IExhaust_fan_power_sensor_2 parameter);

	public Set<IExhaust_fan_power_sensor_2> getUsesOptionalsExhaust_fan_power_sensor_2();

    public void addUsesOptionalsPressurization_request_count (IPressurization_request_count parameter);

	public Set<IPressurization_request_count> getUsesOptionalsPressurization_request_count();

    public void addUsesOptionalsSupply_air_damper_percentage_command (ISupply_air_damper_percentage_command parameter);

	public Set<ISupply_air_damper_percentage_command> getUsesOptionalsSupply_air_damper_percentage_command();

    public void addUsesOptionalsSupply_air_flowrate_sensor (ISupply_air_flowrate_sensor parameter);

	public Set<ISupply_air_flowrate_sensor> getUsesOptionalsSupply_air_flowrate_sensor();

    public void addUsesOptionalsSupply_fan_run_command (ISupply_fan_run_command parameter);

	public Set<ISupply_fan_run_command> getUsesOptionalsSupply_fan_run_command();

    public void addUsesOptionalsSupply_fan_run_status (ISupply_fan_run_status parameter);

	public Set<ISupply_fan_run_status> getUsesOptionalsSupply_fan_run_status();

    public void addUsesOptionalsSupply_fan_speed_frequency_sensor (ISupply_fan_speed_frequency_sensor parameter);

	public Set<ISupply_fan_speed_frequency_sensor> getUsesOptionalsSupply_fan_speed_frequency_sensor();

    public void addUsesOptionalsSupply_fan_speed_percentage_command (ISupply_fan_speed_percentage_command parameter);

	public Set<ISupply_fan_speed_percentage_command> getUsesOptionalsSupply_fan_speed_percentage_command();

    public void addUsesOptionalsCooling_thermal_power_capacity (ICooling_thermal_power_capacity parameter);

	public Set<ICooling_thermal_power_capacity> getUsesOptionalsCooling_thermal_power_capacity();

    public void addUsesOptionalsLeaving_cooling_coil_temperature_sensor (ILeaving_cooling_coil_temperature_sensor parameter);

	public Set<ILeaving_cooling_coil_temperature_sensor> getUsesOptionalsLeaving_cooling_coil_temperature_sensor();

    public void addUsesOptionalsExhaust_air_damper_percentage_command (IExhaust_air_damper_percentage_command parameter);

	public Set<IExhaust_air_damper_percentage_command> getUsesOptionalsExhaust_air_damper_percentage_command();

    public void addUsesOptionalsExhaust_fan_run_status (IExhaust_fan_run_status parameter);

	public Set<IExhaust_fan_run_status> getUsesOptionalsExhaust_fan_run_status();

    public void addUsesOptionalsOutside_air_flowrate_sensor (IOutside_air_flowrate_sensor parameter);

	public Set<IOutside_air_flowrate_sensor> getUsesOptionalsOutside_air_flowrate_sensor();

    public void addUsesOptionalsOutside_air_flowrate_setpoint (IOutside_air_flowrate_setpoint parameter);

	public Set<IOutside_air_flowrate_setpoint> getUsesOptionalsOutside_air_flowrate_setpoint();

    public void addUsesOptionalsSupply_air_temperature_sensor (ISupply_air_temperature_sensor parameter);

	public Set<ISupply_air_temperature_sensor> getUsesOptionalsSupply_air_temperature_sensor();

    public void addUsesOptionalsSupply_fan_current_sensor_1 (ISupply_fan_current_sensor_1 parameter);

	public Set<ISupply_fan_current_sensor_1> getUsesOptionalsSupply_fan_current_sensor_1();

    public void addUsesOptionalsSupply_fan_current_sensor_2 (ISupply_fan_current_sensor_2 parameter);

	public Set<ISupply_fan_current_sensor_2> getUsesOptionalsSupply_fan_current_sensor_2();

    public void addUsesOptionalsSupply_fan_power_sensor_1 (ISupply_fan_power_sensor_1 parameter);

	public Set<ISupply_fan_power_sensor_1> getUsesOptionalsSupply_fan_power_sensor_1();

    public void addUsesOptionalsSupply_fan_power_sensor_2 (ISupply_fan_power_sensor_2 parameter);

	public Set<ISupply_fan_power_sensor_2> getUsesOptionalsSupply_fan_power_sensor_2();

    public void addUsesOptionalsSupply_fan_speed_frequency_sensor_1 (ISupply_fan_speed_frequency_sensor_1 parameter);

	public Set<ISupply_fan_speed_frequency_sensor_1> getUsesOptionalsSupply_fan_speed_frequency_sensor_1();

    public void addUsesOptionalsSupply_fan_speed_frequency_sensor_2 (ISupply_fan_speed_frequency_sensor_2 parameter);

	public Set<ISupply_fan_speed_frequency_sensor_2> getUsesOptionalsSupply_fan_speed_frequency_sensor_2();

    public void addUsesOptionalsSupply_fan_speed_percentage_sensor_1 (ISupply_fan_speed_percentage_sensor_1 parameter);

	public Set<ISupply_fan_speed_percentage_sensor_1> getUsesOptionalsSupply_fan_speed_percentage_sensor_1();

    public void addUsesOptionalsSupply_fan_speed_percentage_sensor_2 (ISupply_fan_speed_percentage_sensor_2 parameter);

	public Set<ISupply_fan_speed_percentage_sensor_2> getUsesOptionalsSupply_fan_speed_percentage_sensor_2();

    public void addUsesOptionalsExhaust_fan_speed_frequency_sensor_1 (IExhaust_fan_speed_frequency_sensor_1 parameter);

	public Set<IExhaust_fan_speed_frequency_sensor_1> getUsesOptionalsExhaust_fan_speed_frequency_sensor_1();

    public void addUsesOptionalsExhaust_fan_speed_frequency_sensor_2 (IExhaust_fan_speed_frequency_sensor_2 parameter);

	public Set<IExhaust_fan_speed_frequency_sensor_2> getUsesOptionalsExhaust_fan_speed_frequency_sensor_2();

    public void addUsesOptionalsExhaust_fan_speed_percentage_sensor_1 (IExhaust_fan_speed_percentage_sensor_1 parameter);

	public Set<IExhaust_fan_speed_percentage_sensor_1> getUsesOptionalsExhaust_fan_speed_percentage_sensor_1();

    public void addUsesOptionalsExhaust_fan_speed_percentage_sensor_2 (IExhaust_fan_speed_percentage_sensor_2 parameter);

	public Set<IExhaust_fan_speed_percentage_sensor_2> getUsesOptionalsExhaust_fan_speed_percentage_sensor_2();

}