package com.sg.aurora.forecasttriggerworker.client.aurora;


import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.aurora.gen.*;

public class AuroraSchedulerClientFactory {

	/** The Constant logger. */
	private final static Logger logger = LoggerFactory.getLogger(AuroraSchedulerClientFactory.class);
	
	/**
	 * Creates a new AuroraSchedulerClient object.
	 *
	 * @param connectionUrl the connection url
	 * @return the client
	 * @throws Exception the exception
	 */
	public static ReadOnlyScheduler.Client createReadOnlySchedulerClient(String connectionUrl) throws Exception {
		try {
			TTransport transport = new THttpClient(connectionUrl);
			transport.open();
			TProtocol protocol = new TJSONProtocol(transport);
			return new ReadOnlyScheduler.Client(protocol);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			throw ex;
		}
	}
	
	public static AuroraSchedulerManager.Client createSchedulerManagerClient(String connectionUrl) throws Exception {
		try {
			TTransport transport = new THttpClient(connectionUrl);
			transport.open();
			TProtocol protocol = new TJSONProtocol(transport);
			return new AuroraSchedulerManager.Client(protocol);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			throw ex;
		}
	}
	
}
