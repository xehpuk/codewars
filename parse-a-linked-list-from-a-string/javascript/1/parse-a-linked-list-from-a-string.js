const delimiter = ' -> '
const { length } = delimiter

function parse(string) {
  const index = string.indexOf(delimiter)
  return index === -1
    ? null
    : new Node(+string.substr(0, index), parse(string.substr(index + length)))
}