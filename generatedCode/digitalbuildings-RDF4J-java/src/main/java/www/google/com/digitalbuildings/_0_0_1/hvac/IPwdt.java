package www.google.com.digitalbuildings._0_0_1.hvac;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_water_isolation_valve_status;
import www.google.com.digitalbuildings._0_0_1.fields.IFlowrate_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_supply_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_water_temperature_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.IRun_status;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_supply_water_temperature_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_return_water_isolation_valve_percentage_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_water_bypass_valve_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.ICogeneration_return_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IRun_command;
import www.google.com.digitalbuildings._0_0_1.fields.IDifferential_pressure_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.IHeater_run_command;
import www.google.com.digitalbuildings._0_0_1.fields.IPrimary_return_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IReturn_water_isolation_valve_status;
import www.google.com.digitalbuildings._0_0_1.fields.IProcess_return_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICondenser_pressure_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICondensing_return_water_isolation_valve_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.IProcess_water_differential_pressure_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICompressor_run_status_2;
import www.google.com.digitalbuildings._0_0_1.fields.ICompressor_run_status_1;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_supply_water_isolation_valve_command;
import www.google.com.digitalbuildings._0_0_1.fields.IDifferential_pressure_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IHeat_exchange_supply_water_isolation_valve_percentage_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_water_isolation_valve_command;
import www.google.com.digitalbuildings._0_0_1.fields.ICogeneration_return_water_temperature_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.IReturn_water_isolation_valve_percentage_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IEvaporator_pressure_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IReturn_water_isolation_valve_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_return_water_isolation_valve_command;
import www.google.com.digitalbuildings._0_0_1.fields.IReturn_water_isolation_valve_command;
import www.google.com.digitalbuildings._0_0_1.fields.IHeater_run_command_1;
import www.google.com.digitalbuildings._0_0_1.fields.ICondensing_supply_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICompressor_run_command_1;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_return_water_isolation_valve_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.IPrimary_supply_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IHeater_run_command_2;
import www.google.com.digitalbuildings._0_0_1.fields.ICompressor_run_command_2;
import www.google.com.digitalbuildings._0_0_1.fields.IProcess_supply_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_return_water_isolation_valve_status;
import www.google.com.digitalbuildings._0_0_1.fields.IRefrigerant_condenser_saturation_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_water_bypass_valve_percentage_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICompressor_run_command;
import www.google.com.digitalbuildings._0_0_1.fields.IProcess_water_differential_pressure_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.IRefrigerant_evaporator_saturation_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.IFlowrate_setpoint;
import www.google.com.digitalbuildings._0_0_1.fields.IHeat_exchange_supply_water_isolation_valve_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_water_isolation_valve_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.ISupply_water_isolation_valve_percentage_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICompressor_run_status;
import www.google.com.digitalbuildings._0_0_1.fields.IChilled_supply_water_isolation_valve_status;
import www.google.com.digitalbuildings._0_0_1.fields.ICondensing_return_water_temperature_sensor;
import www.google.com.digitalbuildings._0_0_1.fields.ICondensing_return_water_isolation_valve_percentage_sensor;
/**
* Class Pwdt 
* Primary-side water delta-T monitoring.
*/
public interface IPwdt extends IFunctionality{

	public IRI iri();

    public void addUsesPrimary_return_water_temperature_sensor (IPrimary_return_water_temperature_sensor parameter);

	public Set<IPrimary_return_water_temperature_sensor> getUsesPrimary_return_water_temperature_sensor();

    public void addUsesPrimary_supply_water_temperature_sensor (IPrimary_supply_water_temperature_sensor parameter);

	public Set<IPrimary_supply_water_temperature_sensor> getUsesPrimary_supply_water_temperature_sensor();

    public void addUsesDifferential_pressure_sensor (IDifferential_pressure_sensor parameter);

	public Set<IDifferential_pressure_sensor> getUsesDifferential_pressure_sensor();

    public void addUsesDifferential_pressure_setpoint (IDifferential_pressure_setpoint parameter);

	public Set<IDifferential_pressure_setpoint> getUsesDifferential_pressure_setpoint();

    public void addUsesSupply_water_temperature_sensor (ISupply_water_temperature_sensor parameter);

	public Set<ISupply_water_temperature_sensor> getUsesSupply_water_temperature_sensor();

    public void addUsesSupply_water_temperature_setpoint (ISupply_water_temperature_setpoint parameter);

	public Set<ISupply_water_temperature_setpoint> getUsesSupply_water_temperature_setpoint();

    public void addUsesRun_command (IRun_command parameter);

	public Set<IRun_command> getUsesRun_command();

    public void addUsesRun_status (IRun_status parameter);

	public Set<IRun_status> getUsesRun_status();

    public void addUsesHeater_run_command_1 (IHeater_run_command_1 parameter);

	public Set<IHeater_run_command_1> getUsesHeater_run_command_1();

    public void addUsesHeater_run_command_2 (IHeater_run_command_2 parameter);

	public Set<IHeater_run_command_2> getUsesHeater_run_command_2();

    public void addUsesReturn_water_isolation_valve_percentage_command (IReturn_water_isolation_valve_percentage_command parameter);

	public Set<IReturn_water_isolation_valve_percentage_command> getUsesReturn_water_isolation_valve_percentage_command();

    public void addUsesReturn_water_isolation_valve_percentage_sensor (IReturn_water_isolation_valve_percentage_sensor parameter);

	public Set<IReturn_water_isolation_valve_percentage_sensor> getUsesReturn_water_isolation_valve_percentage_sensor();

    public void addUsesHeater_run_command (IHeater_run_command parameter);

	public Set<IHeater_run_command> getUsesHeater_run_command();

    public void addUsesReturn_water_isolation_valve_command (IReturn_water_isolation_valve_command parameter);

	public Set<IReturn_water_isolation_valve_command> getUsesReturn_water_isolation_valve_command();

    public void addUsesReturn_water_isolation_valve_status (IReturn_water_isolation_valve_status parameter);

	public Set<IReturn_water_isolation_valve_status> getUsesReturn_water_isolation_valve_status();

    public void addUsesSupply_water_isolation_valve_command (ISupply_water_isolation_valve_command parameter);

	public Set<ISupply_water_isolation_valve_command> getUsesSupply_water_isolation_valve_command();

    public void addUsesSupply_water_isolation_valve_status (ISupply_water_isolation_valve_status parameter);

	public Set<ISupply_water_isolation_valve_status> getUsesSupply_water_isolation_valve_status();

    public void addUsesProcess_water_differential_pressure_sensor (IProcess_water_differential_pressure_sensor parameter);

	public Set<IProcess_water_differential_pressure_sensor> getUsesProcess_water_differential_pressure_sensor();

    public void addUsesProcess_water_differential_pressure_setpoint (IProcess_water_differential_pressure_setpoint parameter);

	public Set<IProcess_water_differential_pressure_setpoint> getUsesProcess_water_differential_pressure_setpoint();

    public void addUsesProcess_return_water_temperature_sensor (IProcess_return_water_temperature_sensor parameter);

	public Set<IProcess_return_water_temperature_sensor> getUsesProcess_return_water_temperature_sensor();

    public void addUsesProcess_supply_water_temperature_sensor (IProcess_supply_water_temperature_sensor parameter);

	public Set<IProcess_supply_water_temperature_sensor> getUsesProcess_supply_water_temperature_sensor();

    public void addUsesHeat_exchange_supply_water_isolation_valve_percentage_command (IHeat_exchange_supply_water_isolation_valve_percentage_command parameter);

	public Set<IHeat_exchange_supply_water_isolation_valve_percentage_command> getUsesHeat_exchange_supply_water_isolation_valve_percentage_command();

    public void addUsesHeat_exchange_supply_water_isolation_valve_percentage_sensor (IHeat_exchange_supply_water_isolation_valve_percentage_sensor parameter);

	public Set<IHeat_exchange_supply_water_isolation_valve_percentage_sensor> getUsesHeat_exchange_supply_water_isolation_valve_percentage_sensor();

    public void addUsesFlowrate_sensor (IFlowrate_sensor parameter);

	public Set<IFlowrate_sensor> getUsesFlowrate_sensor();

    public void addUsesFlowrate_setpoint (IFlowrate_setpoint parameter);

	public Set<IFlowrate_setpoint> getUsesFlowrate_setpoint();

    public void addUsesChilled_supply_water_temperature_sensor (IChilled_supply_water_temperature_sensor parameter);

	public Set<IChilled_supply_water_temperature_sensor> getUsesChilled_supply_water_temperature_sensor();

    public void addUsesChilled_supply_water_temperature_setpoint (IChilled_supply_water_temperature_setpoint parameter);

	public Set<IChilled_supply_water_temperature_setpoint> getUsesChilled_supply_water_temperature_setpoint();

    public void addUsesChilled_return_water_isolation_valve_percentage_command (IChilled_return_water_isolation_valve_percentage_command parameter);

	public Set<IChilled_return_water_isolation_valve_percentage_command> getUsesChilled_return_water_isolation_valve_percentage_command();

    public void addUsesChilled_return_water_isolation_valve_percentage_sensor (IChilled_return_water_isolation_valve_percentage_sensor parameter);

	public Set<IChilled_return_water_isolation_valve_percentage_sensor> getUsesChilled_return_water_isolation_valve_percentage_sensor();

    public void addUsesCompressor_run_command (ICompressor_run_command parameter);

	public Set<ICompressor_run_command> getUsesCompressor_run_command();

    public void addUsesCompressor_run_status (ICompressor_run_status parameter);

	public Set<ICompressor_run_status> getUsesCompressor_run_status();

    public void addUsesCondenser_pressure_sensor (ICondenser_pressure_sensor parameter);

	public Set<ICondenser_pressure_sensor> getUsesCondenser_pressure_sensor();

    public void addUsesEvaporator_pressure_sensor (IEvaporator_pressure_sensor parameter);

	public Set<IEvaporator_pressure_sensor> getUsesEvaporator_pressure_sensor();

    public void addUsesChilled_return_water_isolation_valve_command (IChilled_return_water_isolation_valve_command parameter);

	public Set<IChilled_return_water_isolation_valve_command> getUsesChilled_return_water_isolation_valve_command();

    public void addUsesChilled_return_water_isolation_valve_status (IChilled_return_water_isolation_valve_status parameter);

	public Set<IChilled_return_water_isolation_valve_status> getUsesChilled_return_water_isolation_valve_status();

    public void addUsesCondensing_return_water_isolation_valve_percentage_command (ICondensing_return_water_isolation_valve_percentage_command parameter);

	public Set<ICondensing_return_water_isolation_valve_percentage_command> getUsesCondensing_return_water_isolation_valve_percentage_command();

    public void addUsesCondensing_return_water_isolation_valve_percentage_sensor (ICondensing_return_water_isolation_valve_percentage_sensor parameter);

	public Set<ICondensing_return_water_isolation_valve_percentage_sensor> getUsesCondensing_return_water_isolation_valve_percentage_sensor();

    public void addUsesRefrigerant_condenser_saturation_temperature_sensor (IRefrigerant_condenser_saturation_temperature_sensor parameter);

	public Set<IRefrigerant_condenser_saturation_temperature_sensor> getUsesRefrigerant_condenser_saturation_temperature_sensor();

    public void addUsesRefrigerant_evaporator_saturation_temperature_sensor (IRefrigerant_evaporator_saturation_temperature_sensor parameter);

	public Set<IRefrigerant_evaporator_saturation_temperature_sensor> getUsesRefrigerant_evaporator_saturation_temperature_sensor();

    public void addUsesCompressor_run_command_1 (ICompressor_run_command_1 parameter);

	public Set<ICompressor_run_command_1> getUsesCompressor_run_command_1();

    public void addUsesCompressor_run_command_2 (ICompressor_run_command_2 parameter);

	public Set<ICompressor_run_command_2> getUsesCompressor_run_command_2();

    public void addUsesCompressor_run_status_1 (ICompressor_run_status_1 parameter);

	public Set<ICompressor_run_status_1> getUsesCompressor_run_status_1();

    public void addUsesCompressor_run_status_2 (ICompressor_run_status_2 parameter);

	public Set<ICompressor_run_status_2> getUsesCompressor_run_status_2();

    public void addUsesChilled_supply_water_isolation_valve_command (IChilled_supply_water_isolation_valve_command parameter);

	public Set<IChilled_supply_water_isolation_valve_command> getUsesChilled_supply_water_isolation_valve_command();

    public void addUsesChilled_supply_water_isolation_valve_status (IChilled_supply_water_isolation_valve_status parameter);

	public Set<IChilled_supply_water_isolation_valve_status> getUsesChilled_supply_water_isolation_valve_status();

    public void addUsesChilled_water_bypass_valve_percentage_command (IChilled_water_bypass_valve_percentage_command parameter);

	public Set<IChilled_water_bypass_valve_percentage_command> getUsesChilled_water_bypass_valve_percentage_command();

    public void addUsesChilled_water_bypass_valve_percentage_sensor (IChilled_water_bypass_valve_percentage_sensor parameter);

	public Set<IChilled_water_bypass_valve_percentage_sensor> getUsesChilled_water_bypass_valve_percentage_sensor();

    public void addUsesCondensing_return_water_temperature_sensor (ICondensing_return_water_temperature_sensor parameter);

	public Set<ICondensing_return_water_temperature_sensor> getUsesCondensing_return_water_temperature_sensor();

    public void addUsesCondensing_supply_water_temperature_sensor (ICondensing_supply_water_temperature_sensor parameter);

	public Set<ICondensing_supply_water_temperature_sensor> getUsesCondensing_supply_water_temperature_sensor();

    public void addUsesSupply_water_isolation_valve_percentage_command (ISupply_water_isolation_valve_percentage_command parameter);

	public Set<ISupply_water_isolation_valve_percentage_command> getUsesSupply_water_isolation_valve_percentage_command();

    public void addUsesSupply_water_isolation_valve_percentage_sensor (ISupply_water_isolation_valve_percentage_sensor parameter);

	public Set<ISupply_water_isolation_valve_percentage_sensor> getUsesSupply_water_isolation_valve_percentage_sensor();

    public void addUsesCogeneration_return_water_temperature_sensor (ICogeneration_return_water_temperature_sensor parameter);

	public Set<ICogeneration_return_water_temperature_sensor> getUsesCogeneration_return_water_temperature_sensor();

    public void addUsesCogeneration_return_water_temperature_setpoint (ICogeneration_return_water_temperature_setpoint parameter);

	public Set<ICogeneration_return_water_temperature_setpoint> getUsesCogeneration_return_water_temperature_setpoint();

}