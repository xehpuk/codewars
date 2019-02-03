const path = require('path')

class FileMaster {
  constructor(filepath) {
    const extname = path.extname(filepath)
    this.extension = () => extname.substr(1)
    this.filename = () => path.basename(filepath, extname)
    this.dirpath = () => path.dirname(filepath) + path.sep
  }
}