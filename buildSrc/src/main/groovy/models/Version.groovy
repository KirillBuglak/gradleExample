package models

class Version {
    String versionNumber
    String description

    Version(String versionNumber, String description) {
        this.versionNumber = versionNumber
        this.description = description
    }

    @Override
    String toString() {
        "$versionNumber-$description"
    }
}
