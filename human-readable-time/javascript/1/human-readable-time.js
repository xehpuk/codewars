const f = 60;
const d = (a, b) => Math.trunc(a / b);
const p = n => n < 10 ? '0' + n : '' + n;

function humanReadable(s) {
  let m = d(s, f);
  let h = d(m, f);
  let mm = m - f * h;
  let ss = s - f * m;
  return `${p(h)}:${p(mm)}:${p(ss)}`;
}