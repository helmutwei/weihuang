# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

# [current tag] - 666

# [1.8.3] - 30.08.2023
## changed
-changed batch scripts to execute SWC build
## removed
- removed deploying MKS_Persistent Artifacts to Integrity
- removed Filters from SWC choice

# [1.8.2] - 19.07.2023
## changed
-Fixed Veos Library generation bug

# [1.8.1] - 18.07.2023
## changed
- refactored RutPipelineTriggerFactory.groovy to use only PPC variant
- changed LogRotation to Midterm (30 Days)

# [1.8.0] - 30.06.2023
## added
- added boolean checkbox option to UI to make A2L-check optional
- added catchError so that A2L-check won't make the build fail if the check fails

# [1.7.9] - 23.06.2023
## changed
- changed pilCheckpoint StringParam to GitParam
- changed library flags to Boolean Parameter
- deactivated Veos Lib for C07 from Pipeline instead of UI
## added
- description to CompilerValidation flag

# [1.7.8] - 13.06.2023
## removed
- removed remounting of N-drive when it is already connected
## added
- github actions workflow to automaticly test new pullrequests

## changed
- using System Credentials for Gradle

# [1.7.7] - 01.06.2023
## changed
- changed N-drive path to \\carmbestg003.carmeq.vw.vwg\KTK_Suite_Install\CAx_Compiler_temp
## added
- added blackduck-scan workflow

# [1.7.6] - 31.05.2023
## changed
- changed cleanWs() location in jenkinsfiles

# [1.7.5] - 05.05.2023
## added
- added makefile configuration and finalized serviceLib_Pipeline

# [1.7.4] - 26.04.2023
## removed
- removed reference of veos checkpoint to softwarebuild

# [1.7.3] - 24.04.2023
## added
- added custom steps project configuration and variant sandbox creation to ServiceLibBuild
### changed
- changed Integrity credentials to Integrity-General

# [1.7.2] - 12.04.2023
## changed
- changed N-drive path to \\carmbestg003.carmeq.vw.vwg\KTK_Suite_Install\CAx_Compiler_temp

# [1.7.1] - 06.04.2023
## changed
- changed class ToolSourcesParameterConfigurator so that the ActiveChoice class is being
  used from the shared library
- refactored functionalities from ToolSourcesParameterConfigurator

# [1.7.0] - 05.04.2023
## added
- added the possibility to use a pre-built service library instead of building it within the pipeline

# [1.6.4] - 30.03.2023
## added
- added class EnvironmentVariablesHandler.groovy for removing and restoring environment
  values of different environment variables
- added temporary manipulation of environment variable Path to pipeline stage "execute
  swc integration build"

# [1.6.3] - 21.03.2023
## added
- added functionality so that the MKS_Persistent single select option will only be
  shown if the Use_MKS_Persistent checkbox is ticked
## changed
- changed UI so that MKS_Persistent option follows directly after the Service option
## bugfix
- updated version of shared lib in jobDslLauncher.groovy
- fixed failing swc-integration pipeline because of a false used bash.exe in Windows path

# [1.6.2] - 08.03.2023
## added
- Adjustment to artifact names for softwarebuild C07_*

# [1.6.1] - 24.02.2023
## added
- added MKS_Persistent Checkbox to UI
- added artifact validation in ArtifactValidator
## removed
- removed AUTOSAR_TASK_ID default input
## changed 
- Expanded Target Version Validation to satisfy new convention
- refactored TargetVersion2Mapper and VersionVariantMap

# [1.6.0] - 30.01.2023
## changed
- changed Sil Env Parameters to active choice
- disabled VEOS Lib for Software build from C07

# [1.5.9] - 18.01.2023
## added
- A2l-Checker Parameters to Job Dsl
- added Timeout to Blackduck scan to avoid server side errors
- added support of WildCard VersionKeys to support targetVersion2 with .A, .B, .0 (before only 0A, 0B, 0C was allowed)
- 
# [1.5.8] - 01.12.22
## changed
- updated blackduck scan parameter

# [1.5.7] - 17.11.22
## added
- transfer a2l files for A2lChecker between agent and master node
- Makefile configuration reader
- A check to whether an A2l patched file is expected or not

# [1.5.6] - 11.11.22
## changed
- blackduck proxy settings

# [1.5.5] - 04.11.22
## changed
- Integrity processes use ressources Locker

# [1.5.4] - 17.10.22
## changed
- workaround black duck (catch all errors during black duck execution -> pipeline does not stop)

# [1.5.3] - 06.10.2022
## changed
- moved black duck license check after sourcing
- fixed Compiler_Validation validation bug (validation was always executed)

# [1.5.2] - 30.09.2022
## changed
- reintegrated BlackDuck scan
- updated BlackDuck Scan to use SWC version from targetVersion

# [1.5.1] - 27.09.2022
## added
- added USE_COMPILERVALIDATION flag to set in Makefile defined by user via Jenkins UI

# [1.5.0] - 26.08.2022  
## added
- A2l-Checker Job
- Trigger A2l-Checker-Job from SWC-Int Pipeline
## removed
-DevPath Validation

# [1.4.0] - 16.08.2022
## added
- option to upload ASCET_Path sources as Zip Archive from local machine
  
## changed
- moved project configuration to shared library

# [1.3.0] - 26.07.2022
## added
- flag to set use_ascet_typemap in makefile

# [1.2.0]
## added
- support of checkpoints in UI (only Freestyle)
- alternative path for ASCET-Path in UI with Pipeline-Integration (only Freestyle)
- provide separate artifact makeout.zip
- pilCheckpoint choice 1.25 for C05.1
## bugfix
- RuT-Coupling
  - triggering from process pipeline
  - provide complete 02_libs

# [1.1.0] - 11.05.2022
## added
### [SWC integration build]
- upcoupling of the PIL pipeline
    - updated UI
    - providing artifacts of SWC-Int for Pil-Pipeline
    - triggering of PIL pipeline with arguments
- timeout for process and freestyle build (5 hours)
- logging Build_project2.bat at runtime in console
- archiving of complete workspace (with log rotator)

# [1.0.2] - 04.05.2022
## removed
### [swc integration build]
- creation of empty <swcShortName>_EA_MemMap.h

# [1.0.1] - 29.04.2022
## changed
### [swc integration build]
- updated path of services (moved to 'Powertrain_Functions_PreDev')
## removed
### [swc integration build]
- license check with black duck (different approach to determine target version must be implemented for C05)

# [1.0.0] - 28.04.2022
## changed
### [swc integration build]
- changes autosar task status to InProgress before changepackage creation
- source link of autosar task links to specific checkpoint instead of devpath
- removed mocks from Testserver UI (if mocks are not available in UI, they are deactivated)
- removed 'C' from VersionKey to identify Variant (e.g. 00 instead C00)
# [0.2.1] - 11.04.2022
### Changed
#### [swc integration build] 
- bugfix: description in UI of SILVER_RTE
- bugfix: replaced hardcoded configServer in finishSWcIntProccess.groovy to use test-/prod-server for source link setting

# [0.2] - 01.04.2022
### Added
#### [swc integration build] 
- Black Duck license check of swc Source files
- finish of process build
    - closing of changepackage
    - fill out Autosar Task´s description (summary, comment, source-link)
    - set state of Autosar Task to "Finished" 
- provides two testing approaches
    1. testing on productive Integrity server deploying on ZZZDummyPMT
    2. testing on test Integrity server

### Changed
#### [swc integration build] 
- enabled parallel execution of process/freestyle pipeline by enhanced network drive mounting
- weakened artifact validation for documentation (only mandatory if swc sources contain a documentation)
- moved IssueViewer to common-shared-library

# [0.1] - 15.03.2022
### Added
- swc integration build
    - fundamental integration of buildmanagement tool Gradle (actual no out of the box solution)
    - infrastructure of process and freestyle build
        - deployment via jobDslLauncher (connects pipelines with infrastructure)
        - UI using active choice parameter with dynamic Integrity queries
        - dedicated UI for both process and freestyle build 
    - pipeline
        - input validation
        - input processing
        - configuration of subprojects and shares
        - sourcing (based on preconfigured Integrity project)
        - makefile configuration
        - mounting of tools
        - build
        - artifact validation
        - artifact deployment
    - process build (instable)
        - input processing of autosar request (request -> task)
            - validation of ticket type
            - validation of correct devpath selection in UI
        - creates changepackage and does Integrity operations on changepackage
    - freestyle build
        - mocks of swc project and devpath selection for testing purpose
        - artifact archiving in Integrity or on Jenkins
        - selectable variant and targetVersion
    