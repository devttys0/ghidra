/* ###
 * IP: GHIDRA
 * REVIEWED: YES
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.merge;

import ghidra.program.model.data.DataTypeManagerDomainObject;
import ghidra.program.model.listing.DataTypeArchiveChangeSet;

public class DummyArchiveMergeManager extends DataTypeArchiveMergeManager {

	public DummyArchiveMergeManager(	DataTypeManagerDomainObject resultDtArchive, 
										DataTypeManagerDomainObject myDtArchive, 
										DataTypeManagerDomainObject originalDtArchive, 
										DataTypeManagerDomainObject latestDtArchive,
										DataTypeArchiveChangeSet latestChangeSet, 
										DataTypeArchiveChangeSet myChangeSet) {
		
		super(resultDtArchive, myDtArchive, originalDtArchive, latestDtArchive, latestChangeSet, myChangeSet);
	}

	@Override
	public void setCompleted(String[] mergePhase) {
	}

	@Override
	public void setInProgress(String[] mergePhase) {
	}

	@Override
	public void showProgressIcon(boolean show) {
	}

	@Override
	public void updateProgress(int currentProgressPercentage, String progressMessage) {
	}

	@Override
	public void updateProgress(int currentProgressPercentage) {
	}

	@Override
	public void updateProgress(String description) {
	}

}
