export default function Header() {
  return (
    <header className="header">
      <img
        src="src/assets/React-icon.png"
        className="logo-img"
        alt="react logo"
      />
      <nav>
        <ul className="nav-list">
          <li className="nav-list-item">Pricing</li>
          <li className="nav-list-item">About</li>
          <li className="nav-list-item">Contact</li>
        </ul>
      </nav>
    </header>
  );
}
