package com.ctrip.xpipe.redis.keeper.config;

import com.ctrip.xpipe.redis.core.config.AbstractCoreConfig;

/**
 * @author wenchao.meng
 *
 * Aug 18, 2016
 */
public class TestKeeperConfig extends AbstractCoreConfig implements KeeperConfig{
	
	private int replicationStoreCommandFileSize = 1024;
	private int replicationStoreCommandFileNumToKeep = 2;
	private int replicationStoreMaxCommandsToTransferBeforeCreateRdb = 1024;
	
	public TestKeeperConfig(int replicationStoreCommandFileSize, int replicationStoreCommandFileNumToKeep, int replicationStoreMaxCommandsToTransferBeforeCreateRdb) {
		this.replicationStoreCommandFileNumToKeep = replicationStoreCommandFileNumToKeep;
		this.replicationStoreCommandFileSize = replicationStoreCommandFileSize;
		this.replicationStoreMaxCommandsToTransferBeforeCreateRdb = replicationStoreMaxCommandsToTransferBeforeCreateRdb;
	}
	
	@Override
	public int getMetaServerConnectTimeout() {
		return 1000;
	}

	@Override
	public int getMetaServerReadTimeout() {
		return 1000;
	}

	@Override
	public int getMetaRefreshIntervalMillis() {
		return 60000;
	}

	@Override
	public int getReplicationStoreCommandFileSize() {
		return replicationStoreCommandFileSize;
	}

	@Override
	public int getReplicationStoreGcIntervalSeconds() {
		return 2;
	}

	@Override
	public int getReplicationStoreCommandFileNumToKeep() {
		return replicationStoreCommandFileNumToKeep;
	}
	
	@Override
	public long getReplicationStoreMaxCommandsToTransferBeforeCreateRdb() {
		return replicationStoreMaxCommandsToTransferBeforeCreateRdb;
	}
	
	public void setReplicationStoreCommandFileNumToKeep(int replicationStoreCommandFileNumToKeep) {
		this.replicationStoreCommandFileNumToKeep = replicationStoreCommandFileNumToKeep;
	}
	
	public void setReplicationStoreCommandFileSize(int replicationStoreCommandFileSize) {
		this.replicationStoreCommandFileSize = replicationStoreCommandFileSize;
	}

	public void setReplicationStoreMaxCommandsToTransferBeforeCreateRdb(
			int replicationStoreMaxCommandsToTransferBeforeCreateRdb) {
		this.replicationStoreMaxCommandsToTransferBeforeCreateRdb = replicationStoreMaxCommandsToTransferBeforeCreateRdb;
	}
}
