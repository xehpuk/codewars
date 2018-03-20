const units = {
  kB: [1 / 1.024, 'KiB'],
  MB: [1 / Math.pow(1.024, 2), 'MiB'],
  GB: [1 / Math.pow(1.024, 3), 'GiB'],
  TB: [1 / Math.pow(1.024, 4), 'TiB'],
  KiB: [1.024, 'kB'],
  MiB: [Math.pow(1.024, 2), 'MB'],
  GiB: [Math.pow(1.024, 3), 'GB'],
  TiB: [Math.pow(1.024, 4), 'TB']
}

function memorysizeConversion(memorysize) {
  const [f, u] = units[memorysize.substr(memorysize.indexOf(' ') + 1)]
  return `${(f * parseFloat(memorysize)).toLocaleString('en', { maximumFractionDigits: 3 })} ${u}`
}