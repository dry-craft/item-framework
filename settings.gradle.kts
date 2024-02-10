rootProject.name = "item-framework"
include("core")

include("versions:v1_16_R3")
findProject(":versions:v1_16_R3")?.name = "v1_16_R3"
include("versions:v1_19_R1")
findProject(":versions:v1_19_R1")?.name = "v1_19_R1"
