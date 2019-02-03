class FileMaster {
  constructor(filepath) {
    const lastSlash = filepath.lastIndexOf('/') + 1
    const lastDot = filepath.lastIndexOf('.')
    this.extension = () => filepath.substring(lastDot + 1)
    this.filename = () => filepath.substring(lastSlash, lastDot)
    this.dirpath = () => filepath.substring(0, lastSlash)
  }
}